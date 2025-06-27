
package modelo.recomendacion;

import java.util.List;
import modelo.usuario.Usuario;
import modelo.evento.Evento;

public interface IEstrategiaRecomendacion {
    List<Evento> recomendarEventos(Usuario usuario, List<Evento> eventos);
}
