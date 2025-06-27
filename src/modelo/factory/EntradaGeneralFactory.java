
package modelo.factory;

import modelo.entrada.EntradaGeneral;
import modelo.entrada.TipoEntrada;

public class EntradaGeneralFactory implements TipoEntradaFactory {
    public TipoEntrada crearTipoEntrada(String nombre, double precio, int cantidad) {
        return new EntradaGeneral(precio, cantidad);
    }
}
