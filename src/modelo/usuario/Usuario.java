
package modelo.usuario;

import java.util.List;
import modelo.entrada.Entrada;
import modelo.evento.Evento;

public abstract class Usuario {
    protected String id;
    protected String nombre;
    protected String email;
    protected String password;
    protected List<String> preferencias;
    protected List<Entrada> historialCompras;

    public abstract boolean autenticar(String password);
    public abstract List<Evento> obtenerRecomendaciones();
    public abstract void solicitarCompra(Evento evento, int cantidad);
    public abstract void recibirNotificacion(String mensaje);
}
