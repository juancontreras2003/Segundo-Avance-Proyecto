
package modelo.comando;

import modelo.usuario.Usuario;
import modelo.evento.Evento;
import modelo.entrada.TipoEntrada;
import modelo.compra.Compra;
import modelo.facade.ProcesoCompraFacade;

import java.util.Date;

public class ComprarEntradasCommand implements Command {
    private Usuario usuario;
    private Evento evento;
    private TipoEntrada tipoEntrada;
    private int cantidad;
    private double precioTotal;
    private ProcesoCompraFacade procesador;
    private Compra compraRealizada;
    private Date tiempoEjecucion;
    private boolean ejecutado;
    private String codigoDescuento;

    public boolean execute() { return true; }
    public boolean undo() { return true; }
    public String getDescription() { return "Compra de entradas"; }
    public Date getTiempoEjecucion() { return tiempoEjecucion; }
    public Compra getCompraRealizada() { return compraRealizada; }
    public void setCodigoDescuento(String codigo) { this.codigoDescuento = codigo; }
}
