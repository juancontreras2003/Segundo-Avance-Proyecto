
package modelo.evento;

public interface EstadoEventos {
    void publicar(Evento evento);
    void cancelar(Evento evento);
    void iniciar(Evento evento);
    void finalizar(Evento evento);
}
