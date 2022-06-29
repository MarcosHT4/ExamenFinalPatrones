package estructuras.visitor;

public class Client {

    public static void main(String[] args) {

        ConcreteVisitor concreteVisitor = new ConcreteVisitor();

        ConcreteElement1 concreteElement1 = new ConcreteElement1();
        ConcreteElement2 concreteElement2 = new ConcreteElement2();

        concreteElement1.accept(concreteVisitor);
        concreteElement2.accept(concreteVisitor);

    }

}
