package examen.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor1 implements IServidor {

    private List<Usuario> usuarios = new ArrayList<>();

    public Servidor1() {}

    @Override
    public void servirUsuario(Usuario usuario) {

        System.out.println("Usuario: " + usuario.getNombre() + " añadido al servidor1");
        usuarios.add(usuario);
        System.out.println();

    }
}
