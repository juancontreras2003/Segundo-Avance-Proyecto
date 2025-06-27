
package modelo.usuario;

public class Preferencia {
    private String categoria;
    private String ubicacion;

    public Preferencia(String categoria, String ubicacion) {
        this.categoria = categoria;
        this.ubicacion = ubicacion;
    }

    public String getCategoria() { return categoria; }
    public String getUbicacion() { return ubicacion; }
}
