package officeHours.practice_01_29;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Car {
    String brand;
    Engine e;
    List<String> passengers; //= new ArrayList<>();

    public static void main(String[] args) {
        Car c1 = new Car();
        c1.brand = new String("Toyota");
        c1.e = new Engine("V6", 770);
       // System.out.println("c1 = " + c1);
c1.passengers = Arrays.asList("Ziyouda", "Nursultan", "Krasava");


        System.out.println("c1 = " + c1);
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", e=" + e +
                " Passengers = "+ passengers+
                '}';
    }
}
