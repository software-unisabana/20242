package clases.basico;

public class Audi implements Carro {

    @Override
    public String verPrecio() {
        return "10000";
    }

    public int numeroPuertas(){
        return 4;
    }
}
