package estructuras.proxy;

public class Client {

    public static void main(String[] args) {

        ISubject proxy = new Proxy("https://google.com", "Buscar");

        proxy.request();

    }

}
