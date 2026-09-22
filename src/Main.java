class Hewan {
    void suara() {
        System.out.println("Hewan bersuara");
    }
}

class Kucing extends Hewan {
    @Override 
    void suara() {
        System.out.println("Meow");
    }
}

class Anjing extends Hewan {

}

class MathOperation {
    // Overload Method
    int add (int a, int b) {
        return a + b;
    }

    double add (double a, double b) {
        return a + b;
    }

    int add (int a, int b, int c) {
        return a + b + c;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {

        // Runtime Polymorphism
        Kucing cat = new Kucing();
        System.out.println("Kucing: "); cat.suara();

        Anjing dog = new Anjing();
        System.out.println("Anjing: "); dog.suara();

        Hewan cat2 = new Kucing();
        System.out.println("Kucing 2: "); cat2.suara();

        Hewan dog2 = new Anjing();
        System.out.println("Anjing 2: "); dog2.suara();

        MathOperation m = new MathOperation();
        System.out.println(m.add(1, 5));
    }
}