
package modelo.entrada;

public class EntradaEarlyAccess extends TipoEntrada {
    private int minutosAnticipacion;

    public EntradaEarlyAccess(double precio, int cantidad, int minutosAnticipacion) {
        this.precio = precio;
        this.cantidadDisponible = cantidad;
        this.minutosAnticipacion = minutosAnticipacion;
    }

    public int getTiempoAnticipacion() {
        return minutosAnticipacion;
    }
}
