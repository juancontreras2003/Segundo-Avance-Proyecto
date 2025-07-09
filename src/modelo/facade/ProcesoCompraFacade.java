
package modelo.facade;

import modelo.usuario.Usuario;
import modelo.evento.Evento;
import modelo.entrada.TipoEntrada;
import modelo.entrada.Entrada; // Para la lista de entradas en Compra
import modelo.entrada.EntradaBase; // Para crear instancias base de Entrada
import modelo.compra.Compra;
import modelo.compra.MetodoPago;
import modelo.compra.EstadoCompra;
import modelo.validacion.ValidacionHandler;
import modelo.validacion.ValidacionContext; // Importar ValidacionContext
import modelo.notificacion.SistemaNotificaciones; // Import completo

import java.util.List;
import java.util.ArrayList;

public class ProcesoCompraFacade {
    private final ProcesadorPago procesadorPago;
    private final GeneradorEntradas generadorEntradas;
    private final SistemaNotificaciones sistemaNotificaciones;
    private final ValidacionHandler cadenaValidacionGlobal; // El inicio de la cadena de validaciones

    public ProcesoCompraFacade(ProcesadorPago procesadorPago,
                               GeneradorEntradas generadorEntradas,
                               SistemaNotificaciones sistemaNotificaciones,
                               ValidacionHandler cadenaValidacionGlobal) {
        if (procesadorPago == null) throw new IllegalArgumentException("ProcesadorPago no puede ser nulo.");
        if (generadorEntradas == null) throw new IllegalArgumentException("GeneradorEntradas no puede ser nulo.");
        if (sistemaNotificaciones == null) throw new IllegalArgumentException("SistemaNotificaciones no puede ser nulo.");
        if (cadenaValidacionGlobal == null) throw new IllegalArgumentException("CadenaValidacionGlobal no puede ser nula.");

        this.procesadorPago = procesadorPago;
        this.generadorEntradas = generadorEntradas;
        this.sistemaNotificaciones = sistemaNotificaciones;
        this.cadenaValidacionGlobal = cadenaValidacionGlobal;
    }

    // Método principal que orquesta todo el proceso de compra
    public Compra ejecutarProcesoCompra(Usuario usuario, Evento evento, TipoEntrada tipoEntrada, int cantidad, MetodoPago metodoPago, String codigoDescuento) {

        // 1. Validación inicial usando la cadena de responsabilidad
        ValidacionContext contextoValidacion = new ValidacionContext(usuario, evento, tipoEntrada, cantidad);
        if (!cadenaValidacionGlobal.procesarValidacion(contextoValidacion)) {
            System.err.println("Error de validación: " + cadenaValidacionGlobal.getMensajeError());
            // Podríamos querer obtener el mensaje del handler específico que falló si la cadena se estructura así.
            // Actualmente getMensajeError() en ValidacionHandler base obtendría el último error.
            return null; // La compra no puede proceder
        }

        // 2. Crear instancias de Entrada (base, aún no decoradas si aplica descuento aquí)
        // El precio total se calculará basado en estas entradas.
        // En un sistema real, la creación de 'Entrada' podría ser más compleja,
        // especialmente si cada entrada necesita un ID único, código QR, etc.
        List<Entrada> entradasParaComprar = new ArrayList<>();
        double precioUnitario = tipoEntrada.getPrecio();
        for (int i = 0; i < cantidad; i++) {
            // Creamos una EntradaBase. Los decorators (descuentos) se aplicarían después si es necesario,
            // o el precio ya está ajustado en el tipoEntrada si el descuento es a nivel de tipo.
            entradasParaComprar.add(new EntradaBase(tipoEntrada, evento));
        }
        double totalCalculado = precioUnitario * cantidad;

        // (Opcional) Aplicar código de descuento aquí si afecta el precio total
        // Esto podría modificar totalCalculado o requerir que las 'entradasParaComprar' sean decoradas
        if (codigoDescuento != null && !codigoDescuento.isEmpty()) {
            totalCalculado = aplicarDescuento(totalCalculado, codigoDescuento);
            // Si el descuento es por entrada, habría que decorar cada entrada en entradasParaComprar
            // y recalcular el total sumando los precios de las entradas decoradas.
            // Por simplicidad, aplicamos un descuento al total general.
        }

        // 3. Iniciar el objeto Compra (aún en estado PENDIENTE)
        Compra nuevaCompra = new Compra(usuario, evento, tipoEntrada, cantidad, entradasParaComprar, totalCalculado, metodoPago);
        System.out.println("Compra iniciada ID: " + nuevaCompra.getId() + " por " + totalCalculado);

        // 4. Procesar el pago
        if (!procesadorPago.procesar(metodoPago, nuevaCompra.getTotalPagado())) { // ProcesadorPago necesita el monto
            System.err.println("Error en el procesamiento del pago para la compra ID: " + nuevaCompra.getId());
            nuevaCompra.setEstado(EstadoCompra.CANCELADA); // O un estado específico de fallo de pago
            // Aquí se podría notificar al usuario sobre el fallo del pago.
            return nuevaCompra; // Devolver la compra en estado fallido
        }
        nuevaCompra.setEstado(EstadoCompra.CONFIRMADA);
        System.out.println("Pago procesado y compra confirmada ID: " + nuevaCompra.getId());

        // 5. Generar las entradas (actualizar disponibilidad, etc.)
        // Esto significa que el TipoEntrada debe reducir su disponibilidad.
        if (!tipoEntrada.reducirDisponibilidad(cantidad)) {
            // Esto sería un error grave si la validación de disponibilidad pasó pero aquí falla.
            // Podría indicar un problema de concurrencia. Se necesitaría una lógica de rollback del pago.
            System.err.println("Error CRÍTICO: No se pudo reducir la disponibilidad de entradas después del pago para compra ID: " + nuevaCompra.getId());
            nuevaCompra.setEstado(EstadoCompra.CANCELADA); // O un estado de error específico
            // Intentar revertir el pago (lógica de compensación)
            // procesadorPago.revertirPago(...);
            return nuevaCompra;
        }
        generadorEntradas.generar(evento, tipoEntrada, cantidad, nuevaCompra); // Generador podría necesitar la Compra para asociar entradas
        System.out.println("Entradas generadas para compra ID: " + nuevaCompra.getId());


        // 6. Añadir la compra al historial del usuario
        usuario.addCompraAlHistorial(nuevaCompra);

        // 7. Notificar al usuario
        sistemaNotificaciones.enviarConfirmacionCompra(usuario, nuevaCompra);

        // 8. (Opcional) Generar comprobante
        nuevaCompra.generarComprobante();

        return nuevaCompra;
    }

    // Método placeholder para aplicar descuento
    private double aplicarDescuento(double totalActual, String codigo) {
        // Lógica para validar el código y aplicar el descuento.
        // Por ejemplo, un 10% de descuento.
        if ("DESC10".equals(codigo)) {
            System.out.println("Aplicando descuento del 10% con código: " + codigo);
            return totalActual * 0.90;
        }
        System.out.println("Código de descuento '" + codigo + "' no válido o no aplicable.");
        return totalActual;
    }

    // Métodos de utilidad que podrían ser llamados externamente si es necesario,
    // pero ejecutarProcesoCompra es el punto de entrada principal.

    // public Compra iniciarCompra(Usuario usuario, Evento evento, TipoEntrada tipo, int cantidad, double total, MetodoPago metodo) {
    //     List<Entrada> entradas = new ArrayList<>();
    //     for(int i=0; i<cantidad; i++) entradas.add(new EntradaBase(tipo, evento));
    //     return new Compra(usuario, evento, tipo, cantidad, entradas, total, metodo);
    // }

    // public boolean procesarPago(Compra compra, MetodoPago metodo) {
    //     if (procesadorPago.procesar(metodo, compra.getTotalPagado())) {
    //         compra.setEstado(EstadoCompra.CONFIRMADA);
    //         return true;
    //     }
    //     return false;
    // }

    // public void generarEntradasYActualizarDisponibilidad(Compra compra) {
    //     if (compra.getEstado() == EstadoCompra.CONFIRMADA) {
    //         compra.getTipoEntradaBase().reducirDisponibilidad(compra.getCantidad());
    //         generadorEntradas.generar(compra.getEvento(), compra.getTipoEntradaBase(), compra.getCantidad(), compra);
    //     }
    // }

    // public void notificarConfirmacion(Compra compra) {
    //     if (compra.getEstado() == EstadoCompra.CONFIRMADA) {
    //         sistemaNotificaciones.enviarConfirmacionCompra(compra.getUsuario(), compra);
    //     }
    // }
}
