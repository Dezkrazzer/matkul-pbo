class Animal {
    void eat() {
        System.out.println("eating...");
    }
}

class Cat extends Animal {
    void meow() {
        System.out.println("meowing...");
    }
}

public class App {

    public static void main(String[] args) throws Exception {
        Animal animal1 = new Animal();
        animal1.eat();

        Cat cat1 = new Cat();
        cat1.meow();
    }
}
