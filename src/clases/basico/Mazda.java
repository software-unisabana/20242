package clases.basico;

public class Mazda implements Carro {

    @Override
    public String verPrecio() {
        return "20000";
    }

    @Override
    public int numeroPuertas() {
        return 2;
    }
}
