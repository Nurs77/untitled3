package day55;

public class Casting {
    public static void main(String[] args) {
        int x=10;
        long y=x;

        byte b = (byte)x;
        Dog o = new Dog("Chiwawa");
        o.bark();
    }
}
