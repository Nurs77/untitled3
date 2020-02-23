package day47;

public class ElectricCar_Abstract_CAr extends Car_AbstractIntro {
    int batteryLevel;

    @Override
    public void goForward() {
        System.out.println("car is moving forward");
    }

    @Override
    public void goBackward() {
        System.out.println("car is moving Backward");
    }

    @Override
    public void turn(String direction) {
        System.out.println("Car is turning in : "+direction + " direction");
    }

    @Override
    public void start() {
        System.out.println("This is how electic car start");
    }

    public static void main(String[] args) {
        ElectricCar_Abstract_CAr e1 = new ElectricCar_Abstract_CAr();
        e1.start();
        e1.goForward();
        e1.goBackward();
        e1.turn("left");
    }
}
