
package modelo.facade;

import modelo.usuario.Usuario;
import modelo.evento.Evento;
import modelo.entrada.TipoEntrada;
import modelo.compra.Compra;
import modelo.compra.MetodoPago;
import modelo.validacion.ValidacionHandler;

public class ProcesoCompraFacade {
    private ProcesadorPago procesadorPago;
    private ValidacionHandler validador;
    private GeneradorEntradas generador;
    private modelo.notificacion.SistemaNotificaciones notificaciones;
    private ValidacionHandler cadenaValidacion;

    public Compra iniciarCompra(Usuario usuario, Evento evento, int cantidad, TipoEntrada tipo) { return new Compra(); }
    public void aplicarCodigoDescuento(String codigo) {}
    public boolean procesarPago(MetodoPago metodo) { return true; }
    public boolean validarDisponibilidad(Evento evento, TipoEntrada tipo, int cantidad) { return true; }
    public void generarEntradas(Evento evento, TipoEntrada tipo, int cantidad) {}
    public Compra confirmarCompra() { return new Compra(); }
    public void notificarConfirmacion(Usuario usuario, Compra compra) {}
    public Compra ejecutarProcesoCompra(Usuario usr, Evento evt, TipoEntrada tipo, int cant, MetodoPago pago) { return new Compra(); }
}
