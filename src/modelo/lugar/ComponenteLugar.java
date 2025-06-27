
package modelo.lugar;

import java.util.Date;

public interface ComponenteLugar {
    int obtenerCapacidad();
    boolean estaDisponible(Date fecha);
    boolean reservar(Date fecha, String franja);
    String getNombre();
}
