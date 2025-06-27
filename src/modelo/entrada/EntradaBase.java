
package modelo.entrada;

import modelo.evento.Evento;

public class EntradaBase implements Entrada {
    private TipoEntrada tipoEntrada;
    private Evento evento;

    public double getPrecio() {
        return tipoEntrada.getPrecio();
    }

    public String getDescripcion() {
        return "Entrada base para " + evento;
    }

    public TipoEntrada getTipoEntrada() {
        return tipoEntrada;
    }
}
