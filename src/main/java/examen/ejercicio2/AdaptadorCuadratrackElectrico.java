package examen.ejercicio2;

public class AdaptadorCuadratrackElectrico implements ICuadratracks{

    private ICuadratracksElectrico cuadratracksElectrico;

    public AdaptadorCuadratrackElectrico(ICuadratracksElectrico cuadratracksElectrico) {
        this.cuadratracksElectrico = cuadratracksElectrico;
    }

    @Override
    public void llenarGasolina() {

        cuadratracksElectrico.cargar();

    }

    @Override
    public int estadoCombustible() {
        return cuadratracksElectrico.estadoDeElectricidad();
    }
}
