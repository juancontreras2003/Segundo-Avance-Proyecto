
package modelo.lugar;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Asiento implements ComponenteLugar {
    private String nombre;
    private boolean disponible;
    private Map<Date, String> reservas = new HashMap<>();

    public int obtenerCapacidad() { return 1; }
    public boolean estaDisponible(Date fecha) { return true; }
    public boolean reservar(Date fecha, String franja) { return true; }
    public String getNombre() { return nombre; }
}
