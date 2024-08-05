package clases.patrones.creacional.fabrica;

public class FabricaNueva implements AbstractFactory {

    @Override
    public Tortuga crearTortuga() {
        return new TortugaNueva();
    }

    @Override
    public Goomba crearGoomba() {
        return new GoombaNueva();
    }
}
