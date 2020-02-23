package day49;

public class Burger implements Edible, Juicy {
    public Burger(){

    }

    @Override
public void melt(){
        System.out.println("Juicy burger is melting");
    }


    public void eat() {
        System.out.println("Eating burger with big bite");
    }

    @Override
    public void drink() {
        System.out.println("Eat burger and Drink soda");
    }
}
