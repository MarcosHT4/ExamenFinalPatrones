package examen.ejercicio5;

public class MemoriaExterna extends DecoracionCelular{

    private int precioExtra;
    private int memoriaExtra;

    public MemoriaExterna(ICelular celularBase, int precioExtra, int memoriaExtra) {
        super(celularBase);
        this.precioExtra = precioExtra;
        this.memoriaExtra = memoriaExtra;
    }

    @Override
    public void decorarCelular() {
        super.decorarCelular();
        System.out.println("Decorando el celular con una memoria externa de: " + precioExtra + " Bs." + " y " +
                memoriaExtra + "GB");
        setPrecio(getPrecio()+precioExtra);
        setAlmacenamiento(getAlmacenamiento() + memoriaExtra);
        System.out.println("Ahora el celular tiene las siguientes caracteristicas: ");
        System.out.println("RAM: " + getRam() + " GB");
        System.out.println("CPU: " + getCpu() + " GHZ");
        System.out.println("Almacenamiento: " + getAlmacenamiento() + "GB");
        System.out.println("Precio: " + getPrecio() + "Bs.");
        System.out.println();

    }
}
