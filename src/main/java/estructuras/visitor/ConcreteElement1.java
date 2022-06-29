package visitor.structure;

public class ConcreteElement1 implements IElement {

    private String attribute1;
    private String attribute2;

    public String getAttribute1() {
        return attribute1;
    }

    public void setAttribute1(String attribute1) {
        this.attribute1 = attribute1;
    }

    public String getAttribute2() {
        return attribute2;
    }

    public void setAttribute2(String attribute2) {
        this.attribute2 = attribute2;
    }

    @Override
    public void accept(IVisitor visitor) {

        visitor.visitElement1(this);

    }

    @Override
    public String method1() {
        return null;
    }

    @Override
    public String method2() {
        return null;
    }
}
