
package modelo.template;

import modelo.usuario.Usuario;
import modelo.evento.Evento;
import modelo.entrada.TipoEntrada;
import modelo.compra.Compra;
import modelo.compra.MetodoPago;

public abstract class ProcesoCompraTemplate {
    public final Compra realizarCompraCompleta(Usuario usuario, Evento evento, TipoEntrada tipoEntrada, int cantidad, MetodoPago metodoPago) {
        Compra compra = iniciarCompra(usuario, evento, tipoEntrada, cantidad);
        if (!validarDisponibilidad(compra)) return null;
        aplicarPromocionesSiCorresponde(compra);
        if (!procesarPago(compra, metodoPago)) return null;
        generarEntradas(compra);
        notificarUsuario(compra);
        finalizarCompra(compra);
        return compra;
    }

    protected abstract Compra iniciarCompra(Usuario usr, Evento evt, TipoEntrada tipo, int cant);
    protected abstract boolean procesarPago(Compra compra, MetodoPago metodoPago);
    protected abstract boolean validarDisponibilidad(Compra compra);
    protected void aplicarPromocionesSiCorresponde(Compra compra) {}
    protected abstract void generarEntradas(Compra compra);
    protected abstract void notificarUsuario(Compra compra);
    protected abstract void finalizarCompra(Compra compra);
}
