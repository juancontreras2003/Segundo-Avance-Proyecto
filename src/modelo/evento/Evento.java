
package modelo.evento;

import java.util.Date;
import java.util.List;
import modelo.lugar.Lugar;
import modelo.usuario.Organizador;
import modelo.entrada.TipoEntrada;

public class Evento {
    private String id;
    private String nombre;
    private String descripcion;
    private Date fecha;
    private Lugar lugar;
    private Organizador organizador;
    private List<String> imagenes;
    private List<TipoEntrada> tiposEntrada;
    private double precio;
    private int capacidadTotal;
    private int entradasVendidas;
    private EstadoEventos estadoActual;

    public Evento() {}

    public void setEstado(EstadoEventos nuevoEstado) {
        this.estadoActual = nuevoEstado;
    }

    public void publicar() { estadoActual.publicar(this); }
    public void cancelar() { estadoActual.cancelar(this); }
    public void iniciarEvento() { estadoActual.iniciar(this); }
    public void finalizarEvento() { estadoActual.finalizar(this); }

    public void setNombre(String nombre2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setNombre'");
    }

    public void setDescripcion(String descripcion2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setDescripcion'");
    }

    public void setFecha(Date fecha2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setFecha'");
    }

    public void setPrecio(double precio2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setPrecio'");
    }

    public void setLugar(Lugar lugar2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setLugar'");
    }
}
