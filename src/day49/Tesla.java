package day49;

public class Tesla extends Vehicle implements Autonomous, Chargable {
    int horsePower;
    String model;


    // =======================

    public static void main(String[] args) {
        Tesla t1 = new Tesla();
        t1.start();
        t1.selfDrive();
        t1.goForward();
        t1.chargeable();
        t1.horsePower = 1000;
        t1.model= "SUV";
        t1.year = 2019;
        System.out.println("t1 = " + t1);
    }
    // ========================

    @Override
    public void chargeable() {
        System.out.println("Tesla is charging on special stations");
    }

    @Override
    public void selfDrive() {
        System.out.println("Tesla will self Drive");
    }

    public Tesla() {
        super();
    }

    @Override
    public void start() {
        System.out.println("Tesla is started");
    }

    @Override
    public void goForward() {
        super.goForward();
    }

    @Override
    public String toString() {
        return "Tesla{" +
                "horsePower=" + horsePower +
                ", model='" + model + '\'' +
                ", year=" + year +
                '}';
    }
}
