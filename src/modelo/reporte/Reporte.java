
package modelo.reporte;

public class Reporte {
    private String contenido;

    public Reporte(String contenido) {
        this.contenido = contenido;
    }

    public String getContenido() {
        return contenido;
    }

    @Override
    public String toString() {
        return "Reporte{" + "contenido='" + contenido + ' ' + '}';
    }
}
