package clases.logica;

public class Main {

    public static void main(String[] args) {
        Transferencia transferencia = new Transferencia(new NotificacionTwilio());
        transferencia.realizarTransferencia();
    }
}
