package day45;

public class Apple extends Fruit {

    public Apple(){
        //I want to reuse the functionality
        //already written in super class constructor
        // we can sue super() or super(arguments here)
        // to call super class's constructor
        super("look");

    }

    public static void main(String[] args) {
Apple p1 = new Apple();
    }
}
