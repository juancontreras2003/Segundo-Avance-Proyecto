
package modelo.comando;

import java.util.*;

public class CommandInvoker {
    private List<Command> historialComandos;
    private int posicionActual;
    private int maxHistorial;
    private Map<String, Command> comandosPendientes;
    private boolean modoTransaccional;

    public CommandInvoker(int maxHistorial) {
        this.maxHistorial = maxHistorial;
        this.historialComandos = new ArrayList<>();
        this.comandosPendientes = new HashMap<>();
        this.posicionActual = -1;
    }

    public boolean ejecutarComando(Command comando) {
        boolean resultado = comando.execute();
        if (resultado) agregarAlHistorial(comando);
        return resultado;
    }

    public boolean deshacerUltimoComando() { return false; }
    public boolean rehacerComando() { return false; }
    public List<Command> obtenerHistorial() { return historialComandos; }
    public void limpiarHistorial() {}
    public void setMaxHistorial(int max) { this.maxHistorial = max; }
    public void habilitarModoTransaccional(boolean habilitado) { this.modoTransaccional = habilitado; }
    public boolean ejecutarTransacción(List<Command> comandos) { return false; }
    public int contarComandosEjecutados() { return historialComandos.size(); }
    public Command obtenerUltimoComando() { return null; }
    public void agregarAlHistorial(Command comando) {}
    public void limpiarComandosPosteriores() {}
    public void validarCapacidadHistorial() {}
}
