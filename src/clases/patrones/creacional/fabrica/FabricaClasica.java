package clases.patrones.creacional.fabrica;

public class FabricaClasica implements AbstractFactory {

    @Override
    public Tortuga crearTortuga() {
        return new TortugaClasica();
    }

    @Override
    public Goomba crearGoomba() {
        return new GoombaClasica();
    }
}
