package clases.patrones.comportamiento.chain;

public class Manejador500 implements Manejador {
    @Override
    public boolean esValida(Moneda moneda) {
        return "500 COP".equals(moneda.getTexto()) || "500 Pesos Colombianos".equals(moneda.getTexto());
    }

    @Override
    public int obtenerValor(Moneda moneda) {
        return 500;
    }
}
