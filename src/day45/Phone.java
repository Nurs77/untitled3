package day45;

public class Phone extends Electronic{
    double size;
    double price;

    public static void main(String[] args) {
        Phone p1 = new Phone();
        p1.size = 12;
        p1.price = 39.99;
        p1.brand = "Apple";
        System.out.println("using electricity: "+Electronic.useElectricity);
        displayElectricity();
    }
}
