
package modelo.compra;

public class MetodoPago {
    private String tipo;
    private String numeroTarjeta;
    private String vencimiento;
    private String cvv;

    public MetodoPago(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() { return tipo; }
}
