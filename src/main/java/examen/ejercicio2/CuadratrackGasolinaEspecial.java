package examen.ejercicio2;

import java.util.Random;

public class CuadratrackGasolinaEspecial implements ICuadratracks {

    private String marca;
    private int gasolinaEspecial;

    public CuadratrackGasolinaEspecial(String marca, int gasolina) {
        this.marca = marca;
        this.gasolinaEspecial = gasolina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getGasolinaEspecial() {
        return gasolinaEspecial;
    }

    public void setGasolinaEspecial(int gasolinaEspecial) {
        this.gasolinaEspecial = gasolinaEspecial;
    }


    @Override
    public void llenarGasolina() {

        System.out.println("Llenando gasolina especial en el cuadratrack: " + marca);
        int random = new Random().nextInt(51);
        System.out.println("La gasolina especial se llenará con: " + random);

        if(gasolinaEspecial < 100) {

            gasolinaEspecial +=random;
            if(gasolinaEspecial > 100) {

                gasolinaEspecial = 100;

            }
            System.out.println("Ahora se tiene: " + gasolinaEspecial);
            System.out.println();

        } else {

            System.out.println("La gasolina especial ya está llena!");
            System.out.println();

        }

    }

    @Override
    public int estadoCombustible() {
        return new Random().nextInt(50-1+1)+1;
    }
}
