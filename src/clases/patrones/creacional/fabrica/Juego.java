package clases.patrones.creacional.fabrica;

public class Juego {

    private AbstractFactory factory;

    public Juego(AbstractFactory factory) {
        this.factory = factory;
    }

    /*
    public void empezarJuego(String tipoJuego) {
        Goomba goomba = null;
        Tortuga tortuga = null;
        if ("Clasico".equals(tipoJuego)) {
            goomba = new GoombaClasica();
            tortuga = new TortugaClasica();
        } else if ("Nuevo".equals(tipoJuego)) {
            goomba = new GoombaNueva();
            tortuga = new TortugaNueva();
        } else if (tipoJuego.equals("OtroJuego")) {

        }
        goomba.disparar();
        tortuga.realizarSalto();
    }
     */

    public void empezarJuego() {
        Goomba goomba = factory.crearGoomba();
        Tortuga tortuga = factory.crearTortuga();

        goomba.disparar();
        tortuga.realizarSalto();
    }
}
