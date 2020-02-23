package day48;

public class Plane implements Flyable{
    String name;
    int capacity;
    int speed;

    @Override
    public void fly() {
        System.out.println("Plane is flying");
    }

    public static void main(String[] args) {
        Plane p1 =new Plane();
        p1.fly();
        System.out.println(Flyable.HAVE_WING);
    }
}
