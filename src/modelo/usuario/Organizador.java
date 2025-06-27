
package modelo.usuario;

import java.util.List;
import modelo.evento.Evento;
import modelo.evento.EventoBuilder;

public class Organizador {
    private String id;
    private String nombre;
    private String email;
    private String infoContacto;
    private List<Evento> eventosCreados;

    public Evento crearEvento(EventoBuilder builder) {
        return builder.build();
    }

    public void editarEvento(Evento evento) {}
    public void eliminarEvento(Evento evento) {}
    public String verEstadisticas(Evento evento) {
        return "Estadísticas del evento";
    }
}
