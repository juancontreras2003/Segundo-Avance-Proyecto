
package modelo.multimedia;

public class RecursoReal implements RecursoMultimedia {
    private String url;
    private byte[] contenido;

    public byte[] mostrar() { return contenido; }
    public String getUrlRecurso() { return url; }
}
