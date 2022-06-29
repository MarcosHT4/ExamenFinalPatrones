package estructuras.visitor;

public class ConcreteVisitor implements IVisitor{


    @Override
    public String visitElement1(ConcreteElement1 concreteElement1) {

        //Logica para atender el concrete element 1

        concreteElement1.setAttribute1("Alg1");
        concreteElement1.setAttribute2("Alg2");

        System.out.println("Aplicando visitante en Elemento 1");

        return "Aplicando visitante en Elemento 1";
    }

    @Override
    public String visitElement2(ConcreteElement2 concreteElement2) {

        concreteElement2.setAttribute1("Alg1");
        concreteElement2.setAttribute2("Alg2");

        System.out.println("Aplicando visitante en Elemento 2");

        return "Aplicando visitante en Elemento 2";
    }
}
