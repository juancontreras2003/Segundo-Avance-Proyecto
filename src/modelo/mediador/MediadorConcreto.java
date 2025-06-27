
package modelo.mediador;

import java.util.ArrayList;
import java.util.List;
import modelo.usuario.Usuario;
import modelo.compra.Compra;
import modelo.facade.ProcesoCompraFacade;
import modelo.notificacion.SistemaNotificaciones;
import modelo.recomendacion.GestorRecomendacionesStrategy;

public class MediadorConcreto implements MediadorCompras {
    private List<Usuario> usuarios = new ArrayList<>();
    private ProcesoCompraFacade procesoCompra;
    private SistemaNotificaciones sistemaNotificaciones;
    private GestorRecomendacionesStrategy gestorRecomendaciones;

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public void registrarProcesoCompra(ProcesoCompraFacade proceso) {
        this.procesoCompra = proceso;
    }

    public void notificarCompraExitosa(Usuario usuario, Compra compra) {
        sistemaNotificaciones.enviarNotificacion(usuario, "Compra confirmada");
    }

    public void solicitarRecomendaciones(Usuario usuario) {
        gestorRecomendaciones.generarRecomendaciones(usuario);
    }
}
