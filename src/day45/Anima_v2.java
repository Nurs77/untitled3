package day45;

public class Anima_v2 extends Animal {
    public void speak(){
        super.speak();
        System.out.println("Bark");

    }

    public static void main(String[] args) {
        Anima_v2 twix = new Anima_v2();
        twix.speak();
    }
}
