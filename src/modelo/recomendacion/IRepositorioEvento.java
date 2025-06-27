
package modelo.recomendacion;

import java.util.List;
import modelo.evento.Evento;

public interface IRepositorioEvento {
    List<Evento> obtenerEventos();
}
