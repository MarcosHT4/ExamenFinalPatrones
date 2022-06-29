package examen.ejercicio3;

public class Client {

    public static void main(String[] args) {

        Estudiante estudiante1 = new Estudiante("Dalas", "4375332");
        Estudiante estudiante2 = new Estudiante("Javi", "769879");
        Estudiante estudiante3 = new Estudiante("Nauter", "5687568");
        Estudiante estudiante4 = new Estudiante("Lada", "789798");
        Estudiante estudiante5 = new Estudiante("Shur", "5675");
        Estudiante estudiante6 = new Estudiante("Carisman", "4375334564562");
        Estudiante estudiante7 = new Estudiante("Lizy", "56757");
        Estudiante estudiante8 = new Estudiante("Lorena", "3543");

        SistemaEscuela sistemaEscuela = new SistemaEscuela("Montessori", 1000,
                new Estudiante[]{estudiante1,estudiante2,estudiante3}, "Tener 60 de promedio, tener minimo 13 años");

        SistemaColegio sistemaColegio = new SistemaColegio("La Salle", 3000,
                new Estudiante[]{estudiante4,estudiante5,estudiante6}, "Tener 80 de promedio, tener minimo 7 años");

        SistemaUniversidad sistemaUniversidad = new SistemaUniversidad("UPB", 600,
                new Estudiante[]{estudiante7, estudiante8}, "Tener 70 de promedio, tener minimo 18 años, tener titulo de bachiller");


        sistemaEscuela.setRedSocial(new Facebook());
        sistemaColegio.setRedSocial(new WhatsApp());
        sistemaUniversidad.setRedSocial(new Twitter());

        sistemaEscuela.integrarRedSocial();
        sistemaColegio.integrarRedSocial();
        sistemaUniversidad.integrarRedSocial();



    }

}
