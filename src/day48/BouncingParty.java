package day48;

public class BouncingParty {
    public static void main(String[] args) {
        Kangaroo b1 = new Kangaroo("Nurs", 20);
        System.out.println("b1 = " + b1);
        b1.bounce();
        Ball b2 = new Ball("Oval","purple");
        System.out.println("b2 = " + b2);
        b2.bounce();

    }
}
