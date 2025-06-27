
package modelo.validacion;

import modelo.usuario.Usuario;
import modelo.evento.Evento;

public abstract class ValidacionHandler {
    protected ValidacionHandler next;

    public ValidacionHandler setNext(ValidacionHandler siguiente) {
        this.next = siguiente;
        return siguiente;
    }

    public abstract boolean validar(Usuario usuario, Evento evento, int cantidad);
}
