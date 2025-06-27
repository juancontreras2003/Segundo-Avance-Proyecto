
package modelo.entrada;

public abstract class TipoEntrada {
    protected double precio;
    protected int cantidadDisponible;
    protected int limiteCompra;

    public double getPrecio() { return precio; }
    public void reducirDisponibilidad(int cantidad) {
        this.cantidadDisponible -= cantidad;
    }
}
