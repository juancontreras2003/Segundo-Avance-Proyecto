
package modelo.multimedia;

import modelo.usuario.Usuario;

public class ControlAcceso {
    public boolean verificarPermisoUsuario(Usuario usuario, String tipoRecurso) { return true; }
    public void registrarAcceso(Usuario usuario, String recurso) {}
    public String obtenerNivelAcceso(Usuario usuario) { return "Básico"; }
}
