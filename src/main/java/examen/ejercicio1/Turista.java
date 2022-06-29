package examen.ejercicio1;

import java.util.Random;

public class Turista implements ITurista {

    private String nombre;
    private String ci;
    private double montoDinero;

    public Turista(String nombre, String ci, double montoDinero) {
        this.nombre = nombre;
        this.ci = ci;
        this.montoDinero = montoDinero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public double getMontoDinero() {
        return montoDinero;
    }

    public void setMontoDinero(double montoDinero) {
        this.montoDinero = montoDinero;
    }


    @Override
    public void visitarDepartamento(LaPaz laPaz) {

        System.out.println("Visitando La Paz!");
        System.out.println("Gastaré una cantidad aleatoria!");
        int random = new Random().nextInt(100);
        System.out.println("La cantidad a gastar es de " + random + " Bs." );
        if(random <= montoDinero) {

            montoDinero -=random;
            laPaz.setDineroPorTurismo(random + laPaz.getDineroPorTurismo());
            System.out.println("Listo!");
            System.out.println("Me quedan " + montoDinero + " Bs.");

        } else {

            System.out.println("No tengo dinero suficiente!");
            System.out.println("Me quedan " + montoDinero + " Bs.");


        }

    }

    @Override
    public void visitarDepartamento(Cochabamba cochabamba) {

        System.out.println("Visitando Cocha!");
        System.out.println("Gastaré una cantidad referente al 10% del total de su numero de habitantes!");
        int costo = (cochabamba.getNroHabitantes()*10)/100;
        System.out.println("La cantidad a gastar es de " + costo + " Bs." );
        if(costo <= montoDinero) {

            montoDinero -=costo;
            cochabamba.setDineroPorTurismo(costo + cochabamba.getDineroPorTurismo());
            System.out.println("Listo!");
            System.out.println("Me quedan " + montoDinero + " Bs.");


        } else {

            System.out.println("No tengo dinero suficiente!");
            System.out.println("Me quedan " + montoDinero + " Bs.");


        }


    }

    @Override
    public void visitarDepartamento(SantaCruz santaCruz) {

        System.out.println("Visitando Santa Cruz!");
        System.out.println("Gastaré una cantidad referente al 50% del total de su numero de provincias!");
        int costo = (santaCruz.getNroProvincias()*50)/100;
        System.out.println("La cantidad a gastar es de " + costo + " Bs." );
        if(costo <= montoDinero) {

            montoDinero -=costo;
            santaCruz.setDineroPorTurismo(costo + santaCruz.getDineroPorTurismo());
            System.out.println("Listo!");
            System.out.println("Me quedan " + montoDinero + " Bs.");


        } else {

            System.out.println("No tengo dinero suficiente!");
            System.out.println("Me quedan " + montoDinero + " Bs.");


        }

    }
}
