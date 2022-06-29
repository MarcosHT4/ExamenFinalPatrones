package estructuras.composite;

public class Client {

    public static void main(String[] args) {

        Leaf celular = new Leaf("\t\tCelular1");
        Leaf celular2 = new Leaf("\t\tCelular2");
        Leaf celular3 = new Leaf("\t\tCelular3");
        Leaf celular4 = new Leaf("\t\tCelular4");

        Composite cajaDeCelular = new Composite("\tCajaCelular1");
        cajaDeCelular.add(celular);
        cajaDeCelular.add(celular2);
        cajaDeCelular.add(celular3);
        cajaDeCelular.add(celular4);

        Composite cajaDeCelular2 = new Composite("\tCajaCelular2");

        cajaDeCelular2.add(new Leaf("celular5"));
        cajaDeCelular2.add(new Leaf("celular6"));
        cajaDeCelular2.add(new Leaf("celular7"));
        cajaDeCelular2.add(new Leaf("celular8"));

        Composite contenedorCelular = new Composite("**- ContenedorCelular");

        contenedorCelular.add(cajaDeCelular);
        contenedorCelular.add(cajaDeCelular2);

        Composite contenedorCelular2 = new Composite("**- ContenedorCelular2 ");

        contenedorCelular2.add(cajaDeCelular);
        contenedorCelular2.add(cajaDeCelular2);

        Composite cargaBarcoCelular = new Composite("Carga barco celular");

        cargaBarcoCelular.add(contenedorCelular);
        cargaBarcoCelular.add(contenedorCelular2);

        cargaBarcoCelular.operation();



    }

}
