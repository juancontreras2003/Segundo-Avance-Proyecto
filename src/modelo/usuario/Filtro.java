
package modelo.usuario;

public class Filtro {
    private String categoria;
    private String fecha;
    private String ubicacion;

    public Filtro(String categoria, String fecha, String ubicacion) {
        this.categoria = categoria;
        this.fecha = fecha;
        this.ubicacion = ubicacion;
    }

    public String getCategoria() { return categoria; }
    public String getFecha() { return fecha; }
    public String getUbicacion() { return ubicacion; }
}
