package estructuras.decorator;

public abstract class Decorator implements IComponent{

    private IComponent componentBase;

    public Decorator(IComponent componentBase) {

        this.componentBase = componentBase;

    }

    @Override
    public void operation() {

        componentBase.operation();
        //Agregar logica generica

    }




}
