package estructuras.decorator;

public class ConcreteDecorator2 extends Decorator{

    private String attribute;
    private String attribute2;


    public ConcreteDecorator2(IComponent componentBase) {
        super(componentBase);
    }

    public String getAttribute() {
        return attribute;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    public void addedBehavior() {

        System.out.println("CocnreteDecorator2> Nuevo comportamiento");

    }

    @Override
    public void operation() {

        super.operation();
        //Decorando la funcionalidad
        addedBehavior();
        attribute = "nuevo costo";
        System.out.println("CocnreteDecorator2> Nuevo valor: " + attribute);

    }

}
