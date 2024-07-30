package clases.logica;

import clases.logica.alto.Transferencia;
import clases.logica.bajo.NotificacionTwilio;

public class Main {

    public static void main(String[] args) {
        Transferencia transferencia = new Transferencia(new NotificacionTwilio());
        transferencia.realizarTransferencia();

    }
}
