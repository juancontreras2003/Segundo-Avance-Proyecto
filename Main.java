
import modelo.usuario.Asistente;
import modelo.usuario.Usuario;
import modelo.evento.Evento;
import modelo.entrada.EntradaGeneral;
import modelo.entrada.TipoEntrada;
import modelo.facade.ProcesoCompraFacade;
import modelo.compra.MetodoPago;

public class Main {
    public static void main(String[] args) {
        // Simulación de una compra de entradas
        Usuario usuario = new Asistente();
        Evento evento = new Evento();
        TipoEntrada tipo = new EntradaGeneral(50.0, 100);
        MetodoPago metodo = new MetodoPago("Tarjeta");

        ProcesoCompraFacade compraFacade = new ProcesoCompraFacade();
        compraFacade.ejecutarProcesoCompra(usuario, evento, tipo, 2, metodo);

        System.out.println("Compra realizada con éxito.");
    }
}
