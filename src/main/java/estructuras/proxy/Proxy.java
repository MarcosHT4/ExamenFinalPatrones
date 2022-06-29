package estructuras.proxy;

public class Proxy implements ISubject{

    private RealSubject realSubject;
    private String attribute1;
    private String attribute2;

    public Proxy(String attribute1, String attribute2) {
        this.attribute1 = attribute1;
        this.attribute2 = attribute2;

        realSubject = new RealSubject(this.attribute1, this.attribute2);

    }

    @Override
    public void request() {

        //Conditions...
        //Filters...
        //Verification...

        if(attribute1.contains("https")) {

            realSubject.request();

        } else {

            System.out.println("La llamada es de tipo http, revisar certificados");

        }






    }
}
