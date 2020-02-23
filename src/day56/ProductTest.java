package day56;

public class ProductTest {
    public static void main(String[] args) {
        Product p1 = new Product("Macbook Air", 1199);
        Product p2 = new Product("Sony Tv", 999);
        Product p3 = new Product("Sony Tv",999);
        System.out.println(p1==p2);
        System.out.println(p2==p3);
        System.out.println("p2.equals(p3)= "+ p2.equals(p3)); //IT SHOUDL BE FALSE BUT WITH OVERRIDEN EQUALS IT IS TRUE
        System.out.println("p2.equals(p2)= "+ p2.equals(p2));

        Product p4=p3;
        System.out.println("p4.equals(p3) = " + p4.equals(p3));
        System.out.println("Abc".equals(new String("ABC")));

    }
}
