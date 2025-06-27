
package modelo.comando;

import java.util.Date;
import java.util.List;
import modelo.compra.Compra;
import modelo.compra.EstadoCompra;
import modelo.entrada.Entrada;
import modelo.reembolso.ProcesadorReembolso;

public class ReembolsarCompraCommand implements Command {
    private Compra compra;
    private double montoReembolso;
    private String motivoReembolso;
    private ProcesadorReembolso procesadorReembolso;
    private Date tiempoEjecucion;
    private boolean ejecutado;
    private EstadoCompra estadoAnterior;
    private String transaccionReembolso;
    private List<Entrada> entradasCanceladas;
    private boolean reembolsoParcial;

    public boolean execute() { return true; }
    public boolean undo() { return true; }
    public String getDescription() { return "Reembolso de compra"; }
    public Date getTiempoEjecucion() { return tiempoEjecucion; }
}
