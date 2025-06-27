
package modelo.comando;

import java.util.Date;
import java.util.List;
import modelo.compra.Compra;
import modelo.compra.EstadoCompra;
import modelo.entrada.Entrada;
import modelo.reembolso.ProcesadorReembolso;

public class CancelarCompraCommand implements Command {
    private Compra compra;
    private String motivoCancelacion;
    private ProcesadorReembolso procesadorReembolso;
    private Date tiempoEjecucion;
    private boolean ejecutado;
    private EstadoCompra estadoAnterior;
    private double montoReembolsado;
    private List<Entrada> entradasCanceladas;

    public boolean execute() { return true; }
    public boolean undo() { return true; }
    public String getDescription() { return "Cancelar compra"; }
    public Date getTiempoEjecucion() { return tiempoEjecucion; }
}
