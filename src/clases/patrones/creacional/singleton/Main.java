package clases.patrones.creacional.singleton;

public class Main {

    public static void main(String[] args) {
        Database database = Database.getInstancia();
        System.out.println(database);
        database.consultarUsuarios();

        Database otraInstancia = Database.getInstancia();
        System.out.println(otraInstancia);
        //MYSQL CONNECT usuario y tu clave
        //CRUD
    }
}
