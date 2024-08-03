package clases.patrones.comportamiento.state;

public class EstadoRadicado implements Estado {
    @Override
    public void avanzar(Pedido pedido) {
        //Logica para asignar restaurante
        //bla blas bla bla bla
        if (pedido.isTurbo()) {
            pedido.cambiarEstado(new EstadoCamino());
        } else {
            pedido.cambiarEstado(new EstadoPreparando());
        }
    }
}
