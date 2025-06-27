
package modelo.state;

import modelo.evento.Evento;

public class EstadoEventoFinalizado implements EstadoEventos {
    public void publicar(Evento evento) {}
    public void cancelar(Evento evento) {}
    public void iniciar(Evento evento) {}
    public void finalizar(Evento evento) {}
}
