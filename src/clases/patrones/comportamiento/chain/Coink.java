package clases.patrones.comportamiento.chain;

import java.util.List;

public class Coink {

    private List<Manejador> manejadors;

    public Coink(List<Manejador> manejadors) {
        this.manejadors = manejadors;
    }

    /*
    //Solo con el texto inicailmente
    public void recibirMonedas(List<Moneda> monedas) {
        int dineroIngresado = 0;
        for (String moneda : monedas) {
            if ("500 pesos Colombianos.equals(moneda) || "500 COP".equals(moneda)) {
                dineroIngresado += 500;
            } else if ("200 COP".equals(moneda)) {
                dineroIngresado += 200;
            } else if ("100 COP".equals(moneda)) {
                dineroIngresado += 100;
            } else if ("50 COP".equals(moneda)) {
                dineroIngresado += 50;
            } else if ("1000 COP".equals(moneda)) {
                dineroIngresado += 1000;
            }
        }
    }

     */

    public int recibirMonedas(List<Moneda> monedas) {
        int dineroIngresados = 0;
        for (Moneda moneda : monedas) {
            for (Manejador manejador : manejadors) {
                if (manejador.esValida(moneda)) {
                    dineroIngresados += manejador.obtenerValor(moneda);
                }
            }
        }
        return dineroIngresados;
    }
}
