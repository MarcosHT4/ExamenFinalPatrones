package bridge.structure;

public class Client {

    public static void main(String[] args) {

        Implementor1 implementor1 = new Implementor1();
        Implementor2 implementor2 = new Implementor2();

        ConcreteAbstraction c1 = new ConcreteAbstraction(implementor1);

        c1.method1();
        c1.method2();


    }



}
