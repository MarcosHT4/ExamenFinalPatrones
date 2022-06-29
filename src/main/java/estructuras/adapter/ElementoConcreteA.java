package adapter.structure;

public class ElementoConcreteA implements IAdapter{
    @Override
    public void method1() {

        System.out.println("ElementoConcreteA>method1");
        System.out.println("Realizando logica");

    }

    @Override
    public void method2(String attr1, String attr2) {


        System.out.println("ElementoConcreteA>method2");
        System.out.println("Realizando logica");

    }
}
