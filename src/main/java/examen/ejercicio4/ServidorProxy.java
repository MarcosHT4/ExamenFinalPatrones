package examen.ejercicio4;

public class ServidorProxy implements IServidor {

    private Servidor1 servidor1;
    private Servidor2 servidor2;

    public ServidorProxy() {
        this.servidor1 = new Servidor1();
        this.servidor2 = new Servidor2();
    }


    @Override
    public void servirUsuario(Usuario usuario, String pwd) {

        System.out.println("Intentando añadir al usuario " + usuario.getNombre() + " con id: " + usuario.getId());
        if(pwd.equals(usuario.getPwd())) {

            if(isPrime(usuario.getId())) {

                servidor1.servirUsuario(usuario, pwd);

            } else {

                servidor2.servirUsuario(usuario, pwd);

            }



        } else {

            System.out.println("Error! La contraseña no coincide!!");

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
