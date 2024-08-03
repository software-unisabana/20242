package clases.patrones.comportamiento.state;

public class Pedido {

    private Estado estado;
    private boolean turbo;

    public Pedido(boolean turbo) {
        this.estado = new EstadoRadicado();
        this.turbo = turbo; //Shadowing
    }

    public void avanzarPedido() {
        this.estado.avanzar(this);
    }

    public void cambiarEstado(Estado estado) {
        this.estado = estado;
    }

    public boolean isTurbo() {
        return turbo;
    }
    /*
    public void avanzarPedido() {
        if ("Radicado".equals(estado)) {
            //Logica para asignar restaurante
            //bla blas bla bla bla
            estado = "Preparando";
        } else if ("Preparado".equals(estado)) {
            //Logica  de asignar el repartidor
            //llamar al repartir bla bla bla
            estado = "En camino";
        } else if ("En camino".equals(estado)) {
            //Logica para calcular la ruta
            //Logica para notificar el cliente que su pedido en camino
            estado = "Finalizado";
        }
    }

     */
}
