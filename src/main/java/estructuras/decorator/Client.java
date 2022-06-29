package decorator.structure;

public class Client {

    public static void main(String[] args) {

        IComponent component = new ConcreteComponent(); //Notepad

        component = new ConcreteDecorator1(component); //Plugin para guardar en PDF
        component = new ConcreteDecorator2(component); //Plugin para guardar imagenes

        component.operation();





    }


}
