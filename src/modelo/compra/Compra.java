
package modelo.compra;

import java.util.Date;
import java.util.List;
import modelo.usuario.Usuario;
import modelo.evento.Evento;
import modelo.entrada.Entrada;
import modelo.comando.Command;

public class Compra {
    private String id;
    private Usuario usuario;
    private Evento evento;
    private List<Entrada> entradas;
    private double total;
    private Date fechaCompra;
    private EstadoCompra estado;
    private List<Command> operacionesRealizadas;

    public void generarComprobante() {}
    public boolean solicitarRembolso() { return false; }
    public boolean cancelarCompra() { return false; }
    public void cambiarEstado(EstadoCompra nuevoEstado) {}
    public void agregarOperacion(Command operacion) {}
    public List<Command> obtenerHistorialOperaciones() { return operacionesRealizadas; }
}
