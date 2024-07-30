package clases.logica.bajo;

import clases.logica.alto.Notificacion;

public class NotificacionTwilio implements Notificacion {

    public void notificarCliente() {
        System.out.println("Notificando al cliente a través de Twilio");
    }
}
