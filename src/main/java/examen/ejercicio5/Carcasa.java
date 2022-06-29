package examen.ejercicio5;

public class Carcasa extends DecoracionCelular{

    private int precioExtra;

    public Carcasa(ICelular celularBase, int precioExtra) {
        super(celularBase);
        this.precioExtra = precioExtra;
    }

    @Override
    public void decorarCelular() {
        super.decorarCelular();
        System.out.println("Decorando el celular con una carcasa de: " + precioExtra + " Bs.");
        setPrecio(getPrecio()+precioExtra);
        System.out.println("Ahora el celular tiene las siguientes caracteristicas: ");
        System.out.println("RAM: " + getRam() + " GB");
        System.out.println("CPU: " + getCpu() + " GHZ");
        System.out.println("Almacenamiento: " + getAlmacenamiento() + "GB");
        System.out.println("Precio: " + getPrecio() + "Bs.");
        System.out.println();

    }
}
