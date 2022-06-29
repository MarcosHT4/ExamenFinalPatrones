package examen.ejercicio4;

public class Client {

    public static void main(String[] args) {

        ServidorProxy servidorProxy = new ServidorProxy();

        Usuario  usuario1 = new Usuario(13,"Dalas","wrghuihiuher");
        Usuario usuario2 = new Usuario(4,"Javi", "ehrgeuirherh");
        Usuario  usuario3 = new Usuario(7,"Shur","123");

        servidorProxy.servirUsuario(usuario1);
        servidorProxy.servirUsuario(usuario2);
        servidorProxy.servirUsuario(usuario3);



    }

}
