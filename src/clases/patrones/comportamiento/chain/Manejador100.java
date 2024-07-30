package clases.patrones.comportamiento.chain;

public class Manejador100 implements Manejador {
    @Override
    public boolean esValida(Moneda moneda) {
        return "100 COP".equals(moneda.getTexto());
    }

    @Override
    public int obtenerValor(Moneda moneda) {
        return 100;
    }
}
