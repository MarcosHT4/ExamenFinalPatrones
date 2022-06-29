package examen.ejercicio2;

import java.util.Random;

public class CuadratrackElectrico implements ICuadratracksElectrico{

    private String marca;
    private int bateria;

    public CuadratrackElectrico(String marca, int bateria) {
        this.marca = marca;
        this.bateria = bateria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getBateria() {
        return bateria;
    }

    public void setBateria(int bateria) {
        this.bateria = bateria;
    }

    @Override
    public void cargar() {

        System.out.println("Cargando la bateria del cuadratrack: " + marca);
        int random = new Random().nextInt(21/2)*2;
        System.out.println("La bateria se cargara con: " + random + " Voltios");
        if(bateria < 100) {

            bateria+=random;
            if(bateria > 100) {

                bateria = 100;

            }

            System.out.println("Ahora la bateria esta cargada al: " + bateria);
            System.out.println();

        } else {

            System.out.println("La bateria ya esta cargada!");
            System.out.println();

        }

    }

    @Override
    public int estadoDeElectricidad() {
        return new Random().nextInt(10-1+1)+1;
    }
}
