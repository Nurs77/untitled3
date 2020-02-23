package day49;

public abstract class Vehicle {
    int year;

    public Vehicle(){

    }

    public abstract void start();
    public void goForward(){
        System.out.println("Moving forward");

    }
}
