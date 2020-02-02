package lesson6.homework;

public abstract class Animal {
    int distanceRun;
    int distanceSwim;
    double distanceJump;

    public Animal(){
        distanceRun  = 0;
        distanceSwim = 0;
        distanceJump = 0.0;
    }

    public void run(int distance){
        System.out.println("run: " + (distance <= distanceRun));
    }

    public void swim(int distance){
        System.out.println("run: " + (distance <= distanceSwim));
    }

    public void jump(double distance){
        System.out.println("run: " + (distance <= distanceJump));
    }

}
