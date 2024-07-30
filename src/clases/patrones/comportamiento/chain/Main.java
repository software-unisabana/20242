package clases.patrones.comportamiento.chain;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Manejador manejador100 = new Manejador100();
        Manejador manejador200 = new Manejador200();
        Manejador manejador500 = new Manejador500();

        List<Manejador> manejadors = new ArrayList<Manejador>();
        manejadors.add(manejador100);
        manejadors.add(manejador200);
        manejadors.add(manejador500);
//NO ES UNA INTERFAZ
        Coink coink = new Coink(manejadors);
        List<Moneda> monedas = new ArrayList<>();
        monedas.add(new Moneda("200 COP"));
        monedas.add(new Moneda("100 COP"));
        monedas.add(new Moneda("500 COP"));
        monedas.add(new Moneda("500 Pesos Colombianos"));
        monedas.add(new Moneda("1 USD"));
        monedas.add(new Moneda("1 REAL"));
        int dineroIngresado = coink.recibirMonedas(monedas);
        System.out.println("Dinero ingresado " + dineroIngresado);
    }
}
