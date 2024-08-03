package clases.patrones.estructural;

public class Main {

    public static void main(String[] args) {
        IInternet internet = new Proxy();
        System.out.println(internet.navegar("www.youtube.com"));
    }
}
