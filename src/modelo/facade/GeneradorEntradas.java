
package modelo.facade;

import modelo.evento.Evento;
import modelo.entrada.TipoEntrada;

public class GeneradorEntradas {
    public void generar(Evento evento, TipoEntrada tipo, int cantidad) {
        System.out.println("Generando " + cantidad + " entradas para el evento " + evento);
    }
}
