package clases.patrones.comportamiento.state;

public class EstadoPreparando implements Estado {
    @Override
    public void avanzar(Pedido pedido) {
        //Logica  de asignar el repartidor
        //llamar al repartir bla bla bla
        pedido.cambiarEstado(new EstadoCamino());
    }
}
