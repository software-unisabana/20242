package clases.patrones;

public abstract class Pedido {

    // toma de pedido, la preparación,
    // la verificación de disponibilidad,
    // el cálculo de precios,

    public void procesarPedido() {
        recibirPedido();
        prepararPedido();
        verificarDisponibilidad();
        calcularPrecio();
    }

    void recibirPedido() {
        //esta definido en el padre
    }

    abstract void prepararPedido();

    void verificarDisponibilidad() {

    }

    abstract void calcularPrecio();
}
