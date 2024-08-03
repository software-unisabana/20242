package clases.patrones.estructural;

public class Internet implements IInternet {

    @Override
    public String navegar(String url) {
        return "Retornando contenido de " + url;
    }
    //Middleware
}
