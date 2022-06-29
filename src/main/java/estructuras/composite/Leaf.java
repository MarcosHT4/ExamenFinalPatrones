package estructuras.composite;

public class Leaf extends Component {


    public Leaf(String attribute1) {
        super(attribute1);
    }

    @Override
    public void operation() {

        System.out.println("Leaf > operation");

    }

    @Override
    public void add(Component component) {



    }

    @Override
    public void remove(Component component) {

    }

    @Override
    public Component getChild(int position) {
        return null;
    }
}
