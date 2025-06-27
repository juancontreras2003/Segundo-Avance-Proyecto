
package modelo.mediador;

import modelo.usuario.Usuario;
import modelo.compra.Compra;
import modelo.facade.ProcesoCompraFacade;

public interface MediadorCompras {
    void registrarUsuario(Usuario usuario);
    void registrarProcesoCompra(ProcesoCompraFacade proceso);
    void notificarCompraExitosa(Usuario usuario, Compra compra);
    void solicitarRecomendaciones(Usuario usuario);
}
