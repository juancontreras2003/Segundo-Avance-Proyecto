
package modelo.factory;

import modelo.entrada.TipoEntrada;

public interface TipoEntradaFactory {
    TipoEntrada crearTipoEntrada(String nombre, double precio, int cantidad);
}
