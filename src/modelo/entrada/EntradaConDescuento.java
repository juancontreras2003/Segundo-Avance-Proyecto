
package modelo.entrada;

public class EntradaConDescuento extends EntradaDecorator {
    private double descuento;

    public EntradaConDescuento(Entrada entrada, double descuento) {
        super(entrada);
        this.descuento = descuento;
    }

    @Override
    public double getPrecio() {
        return entradaDecorada.getPrecio() * (1 - descuento);
    }

    @Override
    public String getDescripcion() {
        return entradaDecorada.getDescripcion() + " con descuento";
    }
}
