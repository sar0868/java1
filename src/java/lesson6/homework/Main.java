package lesson6.homework;


public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(100);
        cat.swim(1);
        cat.jump(1.0);

        Animal dog = new Dog();
        dog.run(600);
        dog.swim(8);
        dog.jump(0.4);
    }
}
