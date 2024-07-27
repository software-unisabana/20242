package clases.logica;

public class Transferencia {

    private Notificacion notificacion;

    public Transferencia(Notificacion notificacion) {
        this.notificacion = notificacion;
    }

    public void realizarTransferencia() {
        System.out.println("Transfiriendo dinero");
        //Mover el dinero & consignar
        //Notificacion notificacion = new Notificacion();
        notificacion.notificarCliente();
    }
}
