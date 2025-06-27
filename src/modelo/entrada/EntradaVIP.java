
package modelo.entrada;

import java.util.List;

public class EntradaVIP extends TipoEntrada {
    private List<String> beneficios;

    public EntradaVIP(double precio, int cantidad, List<String> beneficios) {
        this.precio = precio;
        this.cantidadDisponible = cantidad;
        this.beneficios = beneficios;
    }

    public List<String> getBeneficios() {
        return beneficios;
    }
}
