package examen.ejercicio2;

import java.util.Random;

public class CuadratrackDiesel implements ICuadratracks {

    private String marca;
    private int diesel;

    public CuadratrackDiesel(String marca, int gasolina) {
        this.marca = marca;
        this.diesel = gasolina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getDiesel() {
        return diesel;
    }

    public void setDiesel(int diesel) {
        this.diesel = diesel;
    }


    @Override
    public void llenarGasolina() {

        System.out.println("Llenando diesel en el cuadratrack: " + marca);
        int random = new Random().nextInt(51);
        System.out.println("El diesel se llenará con: " + random + " litros");

        if(diesel < 100) {

            diesel +=random;
            if(diesel > 100) {

                diesel = 100;

            }
            System.out.println("Ahora se tiene: " + diesel + " litros de diesel");
            System.out.println();

        } else {

            System.out.println("El diesel ya está lleno!");
            System.out.println();

        }

    }

    @Override
    public int estadoCombustible() {
        return new Random().nextInt(50-1+1)+1;
    }
}
