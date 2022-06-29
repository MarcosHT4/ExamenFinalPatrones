package examen.ejercicio4;

import java.util.ArrayList;
import java.util.List;

public class Servidor2 implements IServidor {

    private List<Usuario> usuarios = new ArrayList<>();

    public Servidor2() {}

    @Override
    public void servirUsuario(Usuario usuario) {

        System.out.println("Usuario: " + usuario.getNombre() + " añadido al servidor2");
        usuarios.add(usuario);
        System.out.println();

    }
}
