package day39;

public class CarCreating {
    public static void main(String[] args) {
        Car car1 = new Car();
        car1.color = "white";
        car1.make = "Toyota";
        car1.model = "4 Runner";
        car1.year = 2020;
        car1.goForward();
        car1.printAge();
        car1.changeColorTo("Blue");


        System.out.println("-----------");

        Car car2 = new Car();
        car2.year = 2017;
        car2.make = "Hyundai";
        car2.model = "Santafe";
        car2.color = "black";
        car2.goForward();

        car2.year = 2020;
        System.out.println("End");

        car2.color = car1.color;

    }
}
