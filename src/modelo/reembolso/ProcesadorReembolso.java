
package modelo.reembolso;

import java.util.*;

import modelo.compra.Compra;
import modelo.usuario.Usuario;
import modelo.notificacion.SistemaNotificaciones;

public class ProcesadorReembolso {
    private Map<String, Double> tarifasComision;
    private List<String> metodosReembolsoDisponibles;
    private int diasLimiteReembolso;
    private SistemaNotificaciones notificaciones;

    public ProcesadorReembolso() {}

    public String procesarReembolso(Compra compra, double monto) { return ""; }
    public boolean validarElegibilidadReembolso(Compra compra, Date fechaLimite) { return false; }
    public double calcularComisionReembolso(double monto, String motivo) { return 0; }
    public void notificarReembolso(Usuario usuario, double monto) {}
    public String generarComprobanteReembolso(Compra compra) { return ""; }
    public List<String> obtenerMetodosDisponibles() { return metodosReembolsoDisponibles; }
    public void configurarTarifaComision(String tipo, double tarifa) {}
    public void setDiasLimiteReembolso(int dias) { this.diasLimiteReembolso = dias; }
    public boolean validarMontoMaximo(double monto, Compra compra) { return true; }
    public String procesarTransaccionBancaria(double monto, String metodo) { return ""; }
    public void registrarReembolsoEnSistema(Compra compra, double monto) {}
}
