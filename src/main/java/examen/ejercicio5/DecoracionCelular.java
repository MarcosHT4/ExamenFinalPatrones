package examen.ejercicio5;

public abstract class DecoracionCelular implements ICelular {

    private ICelular celularBase;

    public DecoracionCelular(ICelular celularBase) {
        this.celularBase = celularBase;
    }

    @Override
    public int getPrecio() {
        return celularBase.getPrecio();
    }

    @Override
    public int getRam() {
        return celularBase.getRam();
    }

    @Override
    public int getCpu() {
        return celularBase.getCpu();
    }

    @Override
    public int getAlmacenamiento() {
        return celularBase.getAlmacenamiento();
    }

    @Override
    public void setPrecio(int precio) {
        celularBase.setPrecio(precio);
    }

    @Override
    public void setRam(int ram) {
        celularBase.setRam(ram);
    }

    @Override
    public void setCpu(int cpu) {
        celularBase.setCpu(cpu);
    }

    @Override
    public void setAlmacenamiento(int almacenamiento) {
        celularBase.setAlmacenamiento(almacenamiento);
    }

    @Override
    public void decorarCelular() {
        celularBase.decorarCelular();
    }
}
