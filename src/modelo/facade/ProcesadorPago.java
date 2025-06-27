
package modelo.facade;

import modelo.compra.MetodoPago;

public class ProcesadorPago {
    public boolean procesar(MetodoPago metodoPago) {
        System.out.println("Procesando pago con método: " + metodoPago.getTipo());
        return true;
    }
}
