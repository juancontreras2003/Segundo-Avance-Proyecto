
package modelo.template;

import modelo.compra.Compra;
import modelo.compra.MetodoPago;
import modelo.evento.Evento;
import modelo.usuario.Usuario;
import modelo.entrada.TipoEntrada;

public class ProcesoCompraEstandar extends ProcesoCompraTemplate {
    @Override
    protected Compra iniciarCompra(Usuario usr, Evento evt, TipoEntrada tipo, int cant) {
        return new Compra();
    }

    @Override
    protected boolean procesarPago(Compra compra, MetodoPago metodoPago) {
        return true;
    }

    @Override
    protected boolean validarDisponibilidad(Compra compra) {
        return true;
    }

    @Override
    protected void generarEntradas(Compra compra) {}

    @Override
    protected void notificarUsuario(Compra compra) {}

    @Override
    protected void finalizarCompra(Compra compra) {}
}
