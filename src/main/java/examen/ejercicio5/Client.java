package examen.ejercicio5;

public class Client {

    public static void main(String[] args) {

        ICelular xiaomi = new Xiaomi(1, 1, 20, 2000);
        xiaomi = new Carcasa(xiaomi, 200);
        xiaomi = new VidrioTemplado(xiaomi, 1000);
        xiaomi = new MemoriaExterna(xiaomi, 5000, 300);

        xiaomi.decorarCelular();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        ICelular samsung = new Samsung(4, 4, 200, 1000);
        samsung = new Carcasa(samsung, 500);
        samsung= new VidrioTemplado(samsung, 300);
        samsung = new MemoriaExterna(samsung, 600, 800);

        samsung.decorarCelular();

        System.out.println("/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*/*//*/*");

        ICelular apple = new Apple(2, 2, 10, 10000);
        apple = new Carcasa(apple, 500);
        apple = new VidrioTemplado(apple, 1000);
        apple = new MemoriaExterna(apple, 10000, 20);
        apple.decorarCelular();


    }

}
