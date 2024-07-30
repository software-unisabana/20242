package clases.patrones.comportamiento.chain;

public interface Manejador {

    boolean esValida(Moneda moneda);

    int obtenerValor(Moneda moneda);
}
