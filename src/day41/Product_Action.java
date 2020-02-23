package day41;



public class Product_Action {
    public static void main(String[] args) {


        Product p1 = new Product();
        p1.setName("Nursultan");
        p1.setPrice(100.99);
        System.out.println(p1.toString());
        
        double myPrice = p1.getPrice();
        System.out.println("myPrice = " + myPrice);

    }
}
