package examen.ejercicio2;

import java.util.Random;

public class CuadratrackGasolina implements ICuadratracks {

    private String marca;
    private int gasolina;

    public CuadratrackGasolina(String marca, int gasolina) {
        this.marca = marca;
        this.gasolina = gasolina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGasolina() {
        return gasolina;
    }

    public void setGasolina(int gasolina) {
        this.gasolina = gasolina;
    }


    @Override
    public void llenarGasolina() {

        System.out.println("Llenando gasolina en el cuadratrack: " + marca);
        int random = new Random().nextInt(51);
        System.out.println("La gasolina se llenará con: " + random);

        if(gasolina < 100) {

            gasolina+=random;
            if(gasolina > 100) {

                gasolina = 100;

            }
            System.out.println("Ahora se tiene: " + gasolina);
            System.out.println();

        } else {

            System.out.println("La gasolina ya está llena!");
            System.out.println();

        }

    }

    @Override
    public int estadoCombustible() {
        return new Random().nextInt(50-1+1)+1;
    }
}
