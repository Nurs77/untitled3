package day39;

public class Car {
    int year;
    String model;
    String make;
    String color;



    public void goForward(){

        System.out.println(make+ "Going Forward");
    }
    public void printAge(){

        System.out.println("car age : " + (2020 - year));
    }
    public void changeColorTo(String newColor){
        // Write bunch of codes here to validate
        // user is actually passing correct color
        color = newColor;
        System.out.println("Changed color: " + color);
    }

}
