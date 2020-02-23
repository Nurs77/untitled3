package day47;


// I Don't need to create car object using this class
// I only want this class to be supper class to provide
// reusable fields and methods for sub classes

public abstract class Car_AbstractIntro {


    int year;
    String brand;
//It is meant to be overriden to provide body in subclass

public abstract void start();

//add abstract void methods
    //goForward
    //goBackward
    //turn(String direction)

    public abstract void goForward();

    public abstract void goBackward();

    public abstract void turn(String direction);



}
