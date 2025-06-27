
package modelo.usuario;

import java.util.List;
import modelo.compra.Compra;
import modelo.entrada.Entrada;
import modelo.comando.Command;
import modelo.comando.CommandInvoker;
import modelo.evento.Evento;
import modelo.entrada.TipoEntrada;

public class Asistente extends Usuario {
    private List<String> preferencias;
    private List<Compra> historialCompras;
    private ConfiguracionNotificaciones config;
    private CommandInvoker commandInvoker;

    @Override
    public boolean autenticar(String password) {
        return this.password.equals(password);
    }

    @Override
    public List<Evento> obtenerRecomendaciones() {
        return null; // lógica de recomendación
    }

    @Override
    public void solicitarCompra(Evento evento, int cantidad) {
        // implementación
    }

    @Override
    public void recibirNotificacion(String mensaje) {
        // implementación
    }

    public List<Evento> buscarEvento(Filtro filtro) { return null; }

    public void comprarEntradas(Evento evento, TipoEntrada tipo, int cantidad) {}
    public void cancelarCompra(Compra compra) {}
    public void solicitarReembolso(Compra compra, String motivo) {}
    public boolean deshacerUltimaOperacion() { return false; }
    public List<Entrada> verEntradasCompradas() { return null; }
    public List<Command> verHistorialOperaciones() { return null; }
    public void actualizarPrefencias(List<String> preferencias) {}
}
