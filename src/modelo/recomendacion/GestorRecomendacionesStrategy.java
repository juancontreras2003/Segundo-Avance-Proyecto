
package modelo.recomendacion;

import java.util.List;
import modelo.usuario.Usuario;
import modelo.evento.Evento;

public class GestorRecomendacionesStrategy {
    private IEstrategiaRecomendacion estrategia;
    private IRepositorioEvento repositorioEventos;

    public void setEstrategia(IEstrategiaRecomendacion estrategia) {
        this.estrategia = estrategia;
    }

    public List<Evento> generarRecomendaciones(Usuario usuario) {
        List<Evento> eventos = repositorioEventos.obtenerEventos();
        return estrategia.recomendarEventos(usuario, eventos);
    }

    public void cambiarEstrategia(String tipoEstrategia) {
        // lógica para cambiar estrategia
    }
}
