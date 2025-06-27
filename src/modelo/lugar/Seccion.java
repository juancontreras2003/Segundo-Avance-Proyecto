
package modelo.lugar;

import java.util.*;

public class Seccion implements ComponenteLugar {
    private String nombre;
    private int capacidad;
    private List<ComponenteLugar> asientos = new ArrayList<>();
    private Map<Date, String> reservas = new HashMap<>();

    public int obtenerCapacidad() { return capacidad; }
    public boolean estaDisponible(Date fecha) { return true; }
    public boolean reservar(Date fecha, String franja) { return true; }
    public void agregarAsiento(ComponenteLugar asiento) { asientos.add(asiento); }
    public void eliminarAsiento(ComponenteLugar asiento) { asientos.remove(asiento); }
    public String getNombre() { return nombre; }
}
