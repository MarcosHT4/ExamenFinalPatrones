package adapter.structure;

public class ConcreteAdapter implements IAdapter{

    private Adaptee adaptee = new Adaptee();

    public ConcreteAdapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    public Adaptee getAdaptee() {
        return adaptee;
    }

    public void setAdaptee(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void method1() {
        System.out.println("ConcreteAdapter> method1");

        adaptee.method1Action1();

    }

    @Override
    public void method2(String attr1, String attr2) {

        System.out.println("ConcreteAdapter> method2");
        adaptee.method2Action2(attr1);
        adaptee.method3Action3(attr2);


    }
}
