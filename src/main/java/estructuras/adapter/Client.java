package estructuras.adapter;

public class Client {

    public static void main(String []args) {

        IAdapter elementoConcreteA = new ElementoConcreteA();
        elementoConcreteA.method1();
        elementoConcreteA.method2("Prueba", "Prueba2");

        Adaptee adaptee = new Adaptee();

        IAdapter elementAdaptado = new ConcreteAdapter(adaptee);
        elementAdaptado.method1();
        elementAdaptado.method2("Prueba", "Prueba2");

    }

}
