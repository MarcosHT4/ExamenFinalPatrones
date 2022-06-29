package examen.ejercicio5;

public class Samsung implements ICelular {

    private int ram;
    private int cpu;
    private int almacenamiento;
    private int precio;

    public Samsung(int ram, int cpu, int almacenamiento, int precio) {
        this.ram = ram;
        this.cpu = cpu;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    @Override
    public void decorarCelular() {

        System.out.println("Empezando la decoracion del celular Samsung!");
        System.out.println("Caracteristicas actuales: ");
        System.out.println("RAM: " + ram + " GB");
        System.out.println("CPU: " + cpu + " GHZ");
        System.out.println("Almacenamiento: " + almacenamiento + "GB");
        System.out.println("Precio: " + precio + "Bs.");

    }

    @Override
    public int getRam() {
        return ram;
    }

    @Override
    public void setRam(int ram) {
        this.ram = ram;
    }

    @Override
    public int getCpu() {
        return cpu;
    }

    @Override
    public void setCpu(int cpu) {
        this.cpu = cpu;
    }

    @Override
    public int getAlmacenamiento() {
        return almacenamiento;
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    @Override
    public int getPrecio() {
        return precio;
    }

    @Override
    public void setPrecio(int precio) {
        this.precio = precio;
    }
}
