package day47;

public class GasCar extends Car_AbstractIntro {
    int gasLevel;

    @Override
    public void start() {
        System.out.println("GasCar is starting");
    }

    @Override
    public void goForward() {
        System.out.println("GasCar is going FORWARD");
    }

    @Override
    public void goBackward() {
        System.out.println("GasCar is going BACKWARD");
    }

    @Override
    public void turn(String direction) {
        System.out.println("GasCar is turning " + direction);

    }

    public static void main(String[] args) {
     GasCar g1 = new GasCar();
     g1.gasLevel = 10;
        System.out.println("g1 gas level = " + g1.gasLevel);
     g1.goBackward();
     g1.goForward();
     g1.start();
     g1.turn("Back");
    }
}
