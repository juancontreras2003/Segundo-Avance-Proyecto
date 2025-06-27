
package modelo.entrada;

public abstract class EntradaDecorator implements Entrada {
    protected Entrada entradaDecorada;

    public EntradaDecorator(Entrada entrada) {
        this.entradaDecorada = entrada;
    }

    public double getPrecio() {
        return entradaDecorada.getPrecio();
    }

    public String getDescripcion() {
        return entradaDecorada.getDescripcion();
    }

    public TipoEntrada getTipoEntrada() {
        return entradaDecorada.getTipoEntrada();
    }
}
