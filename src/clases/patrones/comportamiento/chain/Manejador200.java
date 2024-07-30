package clases.patrones.comportamiento.chain;

public class Manejador200 implements Manejador {
    @Override
    public boolean esValida(Moneda moneda) {
        return "200 COP".equals(moneda.getTexto());
    }

    @Override
    public int obtenerValor(Moneda moneda) {
        return 200;
    }
}
