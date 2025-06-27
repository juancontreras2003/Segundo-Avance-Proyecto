
package modelo.recomendacion;

import java.util.List;
import modelo.usuario.Usuario;
import modelo.evento.Evento;

public class RecomendacionPorPopularidad implements IEstrategiaRecomendacion {
    public List<Evento> recomendarEventos(Usuario usuario, List<Evento> eventos) {
        return aplicarTendencias(ordenarPorPopularidad(eventos));
    }

    private List<Evento> ordenarPorPopularidad(List<Evento> eventos) {
        return eventos;
    }

    private List<Evento> aplicarTendencias(List<Evento> eventos) {
        return eventos;
    }
}
