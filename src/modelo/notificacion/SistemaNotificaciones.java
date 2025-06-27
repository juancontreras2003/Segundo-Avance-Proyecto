
package modelo.notificacion;

import java.util.ArrayList;
import java.util.List;
import modelo.usuario.Observer;
import modelo.usuario.Usuario;
import modelo.evento.Evento;

public class SistemaNotificaciones {
    private static SistemaNotificaciones instancia;
    private List<Observer> observers = new ArrayList<>();

    private SistemaNotificaciones() {}

    public static SistemaNotificaciones getInstance() {
        if (instancia == null) {
            instancia = new SistemaNotificaciones();
        }
        return instancia;
    }

    public void registrarObserver(Observer o) { observers.add(o); }
    public void eliminarObserver(Observer o) { observers.remove(o); }
    public void notificarObservers(String mensaje) {
        for (Observer o : observers) {
            o.actualizar(mensaje);
        }
    }

    public void enviarNotificacion(Usuario usuario, String mensaje) {}
    public void notificarCambioEvento(Evento evento) {}
    public void enviarRecomendaciones(Usuario usuario) {}
}
