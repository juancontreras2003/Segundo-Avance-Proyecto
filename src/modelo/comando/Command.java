
package modelo.comando;

import java.util.Date;

public interface Command {
    boolean execute();
    boolean undo();
    String getDescription();
    Date getTiempoEjecucion();
}
