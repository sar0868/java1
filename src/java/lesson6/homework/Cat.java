package lesson6.homework;

public class Cat extends Animal {

    public Cat() {
        distanceRun = 200;
//        distanceSwim = -1;
        distanceJump = 2.0;
    }

    @Override
    public void swim(int distance) {
        System.out.println("cat no swiming");
    }

}
