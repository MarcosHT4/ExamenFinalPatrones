package examen.ejercicio4;

public class ServidorProxy implements IServidor {

    private Servidor1 servidor1;
    private Servidor2 servidor2;

    public ServidorProxy() {
        this.servidor1 = new Servidor1();
        this.servidor2 = new Servidor2();
    }


    @Override
    public void servirUsuario(Usuario usuario) {

        System.out.println("Intentando añadir al usuario " + usuario.getNombre() + " con id: " + usuario.getId());
        if(usuario.getPwd().length() >= 8) {

            if(isPrime(usuario.getId())) {

                servidor1.servirUsuario(usuario);

            } else {

                servidor2.servirUsuario(usuario);

            }



        } else {

            System.out.println("Error! La contraseña es muy corta!");

        }

    }

    private boolean isPrime(int n) {

        if(n<=1) {

            return false;

        }

        for(int i = 2; i<n; i++) {

            if(n%i == 0) {

                return false;

            }

        }

        return true;

    }
}
