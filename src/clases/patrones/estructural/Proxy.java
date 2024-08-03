package clases.patrones.estructural;

public class Proxy implements IInternet {

    Internet realService = new Internet();

    @Override
    public String navegar(String url) {
        if (url.contains("disney") || url.contains("kalilinux") || url.contains("xxx")) {
            throw new IllegalArgumentException("Lastimosamente tu pagina no puede ser accedida");
        }
        return realService.navegar(url);
    }
}
