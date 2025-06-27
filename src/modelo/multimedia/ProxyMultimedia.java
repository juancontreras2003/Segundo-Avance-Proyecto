
package modelo.multimedia;

import java.util.HashMap;
import java.util.Map;
import modelo.usuario.Usuario;

public class ProxyMultimedia implements RecursoMultimedia {
    private RecursoReal recursoReal;
    private String url;
    private Map<String, byte[]> cacheRecurso = new HashMap<>();
    private ControlAcceso controlAcceso;

    public byte[] mostrar() { return cargarRecurso(); }
    public String getUrlRecurso() { return url; }

    private byte[] cargarRecurso() { return new byte[0]; }

    private boolean verificarPermiso(Usuario usuario) { return true; }
}
