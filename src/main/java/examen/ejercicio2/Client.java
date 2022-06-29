package examen.ejercicio2;

public class Client {

    public static void main(String[] args) {

        ICuadratracks cuadratracks = new CuadratrackGasolina("Nissan", 0);
        ICuadratracks cuadratracks2 = new CuadratrackDiesel("Toyota", 0);
        ICuadratracks cuadratrack3 = new CuadratrackGasolina("Suzuki", 0);
        ICuadratracks cuadratracks4 = new AdaptadorCuadratrackElectrico(new CuadratrackElectrico("Tesla", 0));

        cuadratracks.llenarGasolina();
        cuadratracks2.llenarGasolina();
        cuadratrack3.llenarGasolina();
        cuadratracks4.llenarGasolina();

        System.out.println("Estado gasolina Nissan: " + cuadratracks.estadoCombustible());
        System.out.println("Estado diesel Toyota: " + cuadratracks2.estadoCombustible());
        System.out.println("Estado gasolina Suzuki: " + cuadratrack3.estadoCombustible());
        System.out.println("Estado bateria Tesla: " +  cuadratracks4.estadoCombustible());

    }




}
