package clases.logica;

public class Perro implements Mascota {
    @Override
    public void comer() {
        System.out.println("Concentrado");
    }

    @Override
    public void duermen() {
        System.out.println("Dormir");
    }

}
