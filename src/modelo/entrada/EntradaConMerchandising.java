
package modelo.entrada;

import java.util.List;

public class EntradaConMerchandising extends EntradaDecorator {
    private List<String> itemsIncluidos;

    public EntradaConMerchandising(Entrada entrada, List<String> items) {
        super(entrada);
        this.itemsIncluidos = items;
    }

    @Override
    public double getPrecio() {
        return entradaDecorada.getPrecio(); // incluir lógica adicional si necesario
    }

    @Override
    public String getDescripcion() {
        return entradaDecorada.getDescripcion() + " con merchandising";
    }

    public List<String> getItems() {
        return itemsIncluidos;
    }
}
