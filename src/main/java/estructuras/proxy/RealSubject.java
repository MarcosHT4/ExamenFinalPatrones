package estructuras.proxy;

public class RealSubject implements ISubject {

    private String attribute1;
    private String attribute2;

    public RealSubject(String attribute1, String attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;
    }

    @Override

    public void request() {

        System.out.println("RealSubject working");

    }

}
