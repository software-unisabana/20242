package clases.patrones.comportamiento.state;

public class EstadoCamino implements Estado {
    @Override
    public void avanzar(Pedido pedido) {
        //Finalizado.
        pedido.cambiarEstado(null);
    }
}
