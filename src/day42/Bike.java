package day42;

public class Bike {
    int speed;
    int gear;
public Bike(){
    System.out.println("message from constructor");
    gear = 1;

}
public Bike(int newGear){
    gear = newGear;

}
}
