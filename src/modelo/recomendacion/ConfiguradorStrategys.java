
package modelo.recomendacion;

import modelo.usuario.Usuario;

public class ConfiguradorStrategys {
    public IEstrategiaRecomendacion crearEstrategia(String tipo) {
        return switch (tipo) {
            case "historial" -> new RecomendacionPorHistorial();
            case "popularidad" -> new RecomendacionPorPopularidad();
            default -> null;
        };
    }

    public IEstrategiaRecomendacion obtenerEstrategiasPorUsuario(Usuario usuario) {
        return new RecomendacionPorHistorial();
    }
}
