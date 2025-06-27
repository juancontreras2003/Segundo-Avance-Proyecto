
package modelo.usuario;

public interface Subject {
    void registrarObserver(Observer o);
    void eliminarObserver(Observer o);
    void notificarObservers(String mensaje);
}
