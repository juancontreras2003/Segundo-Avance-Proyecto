
package modelo.usuario;

public class ConfiguracionNotificaciones {
    private boolean notificacionesEmail;
    private boolean notificacionesApp;

    public boolean isNotificacionesEmail() {
        return notificacionesEmail;
    }

    public void setNotificacionesEmail(boolean notificacionesEmail) {
        this.notificacionesEmail = notificacionesEmail;
    }

    public boolean isNotificacionesApp() {
        return notificacionesApp;
    }

    public void setNotificacionesApp(boolean notificacionesApp) {
        this.notificacionesApp = notificacionesApp;
    }
}
