package clases.patrones.creacional.singleton;

public class Database {

    //El constructor por defecto existe, HASTA que crean un constructor

    private static Database instancia;

    private Database() {

    }

    public void consultarUsuarios() {
        System.out.println("Consultanod usuarios");
    }

    public static Database getInstancia() {
        if (instancia == null) {
            instancia = new Database();
        }
        return instancia;
    }
}
