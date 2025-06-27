
package modelo.validacion;

import modelo.usuario.Usuario;
import modelo.evento.Evento;

public class ValidarDisponibilidadHandler extends ValidacionHandler {
    @Override
    public boolean validar(Usuario usuario, Evento evento, int cantidad) {
        return true; // lógica
    }
}
