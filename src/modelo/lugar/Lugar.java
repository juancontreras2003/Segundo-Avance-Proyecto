
package modelo.lugar;

import java.util.*;

public class Lugar {
    private String nombre;
    private String direccion;
    private List<ComponenteLugar> secciones = new ArrayList<>();
    private Map<Date, String> reservas = new HashMap<>();

    public int obtenerCapacidad() { return 0; }
    public boolean estaDisponible(Date fecha) { return true; }
    public boolean reservar(Date fecha, String franja) { return true; }
    public void agregarSeccion(ComponenteLugar seccion) { secciones.add(seccion); }
    public void eliminarSeccion(ComponenteLugar seccion) { secciones.remove(seccion); }
    public String getNombre() { return nombre; }
}
