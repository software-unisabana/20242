package clases.patrones.creacional.fabrica;

public class Main {
    public static void main(String[] args) {
        Juego juego = new Juego();
        juego.empezarJuego(new FabricaClasica());
    }
}