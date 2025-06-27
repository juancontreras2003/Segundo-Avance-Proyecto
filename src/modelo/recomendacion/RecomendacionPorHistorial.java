
package modelo.recomendacion;

import java.util.List;
import modelo.usuario.Usuario;
import modelo.evento.Evento;

public class RecomendacionPorHistorial implements IEstrategiaRecomendacion {
    public List<Evento> recomendarEventos(Usuario usuario, List<Evento> eventos) {
        return filtrarPorCategorias(eventos, analizarHistorialCompras(usuario));
    }

    private List<String> analizarHistorialCompras(Usuario usuario) {
        return null;
    }

    private List<Evento> filtrarPorCategorias(List<Evento> eventos, List<String> categorias) {
        return null;
    }
}
