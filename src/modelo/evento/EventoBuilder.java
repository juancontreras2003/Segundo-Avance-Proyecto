
package modelo.evento;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import modelo.entrada.TipoEntrada;
import modelo.lugar.Lugar;
import modelo.usuario.Organizador;

public class EventoBuilder {
    private String nombre;
    private String descripcion;
    private Date fecha;
    private Lugar lugar;
    private Organizador organizador;
    private List<String> imagenes = new ArrayList<>();
    private List<TipoEntrada> tiposEntrada = new ArrayList<>();
    private double precio;

    public EventoBuilder setNombre(String nombre) { this.nombre = nombre; return this; }
    public EventoBuilder setDescripcion(String descripcion) { this.descripcion = descripcion; return this; }
    public EventoBuilder setFecha(Date fecha) { this.fecha = fecha; return this; }
    public EventoBuilder setLugar(Lugar lugar) { this.lugar = lugar; return this; }
    public EventoBuilder setPrecio(double precio) { this.precio = precio; return this; }
    public EventoBuilder addImagen(String imagen) { this.imagenes.add(imagen); return this; }
    public EventoBuilder addTipoEntrada(TipoEntrada entrada) { this.tiposEntrada.add(entrada); return this; }

    public Evento build() {
        Evento evento = new Evento();
        evento.setNombre(nombre);
        evento.setDescripcion(descripcion);
        evento.setFecha(fecha);
        evento.setLugar(lugar);
        evento.setPrecio(precio);
        return evento;
    }
}
