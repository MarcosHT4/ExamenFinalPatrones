package examen.ejercicio1;

public class Client {

    public static void main(String[] args) {

        LaPaz laPaz = new LaPaz(20, 2000, "Frio", 0);
        Cochabamba cochabamba = new Cochabamba(50, 12000, "Templado", 0);
        SantaCruz santaCruz = new SantaCruz(90, 2000, "Calido", 0);

        Turista turista = new Turista("Dalas", "45645", 3000);

        turista.visitarDepartamento(laPaz);
        turista.visitarDepartamento(cochabamba);
        turista.visitarDepartamento(santaCruz);

    }

}
