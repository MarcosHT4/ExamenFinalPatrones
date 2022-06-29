package examen.ejercicio3;

public class Twitter implements IRedSocial{
    @Override
    public void integracionSistemaControl(ISistemaControl sistemaControl) {

        System.out.println("Integracion realizada con Twitter");
        System.out.println("Mostrando los datos del centro educativo...");
        System.out.println("Nombre: " + sistemaControl.getNombre());
        System.out.println("Capacidad: " + sistemaControl.getCapacidad());
        System.out.print("Estudiantes: ");
        for (Estudiante estudiante : sistemaControl.getEstudiantes()) {

            System.out.print(estudiante.getNombre() + ", ");

        }

        System.out.println();
        System.out.println("Requisitos: " + sistemaControl.getRequisitos());
        System.out.println();

    }
}
