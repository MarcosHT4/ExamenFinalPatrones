package examen.ejercicio5;

public class Apple implements ICelular {

    private int ram;
    private int cpu;
    private int almacenamiento;
    private int precio;

    public Apple(int ram, int cpu, int almacenamiento, int precio) {
        this.ram = ram;
        this.cpu = cpu;
        this.almacenamiento = almacenamiento;
        this.precio = precio;
    }

    @Override
    public void decorarCelular() {

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
