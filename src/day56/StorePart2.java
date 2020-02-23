package day56;

import java.util.Arrays;
import java.util.List;

public class StorePart2 {
    public static void main(String[] args) {

        List<Product> teaStore = Arrays.asList(new Product("tea",4),
                new Product("cookies",6),
                new Product("coffee",5));
        Store s2 = new Store("Tea Store",teaStore);
        System.out.println("s2 = " + s2);
        Product p1 = new Product("Latte",9);
        s2.addProduct(p1);
        System.out.println("s2 = " + s2);
        System.out.println("s2.getProductCount() = " + s2.getProductCount());
        s2.displayAllProducts();
        System.out.println("s2.checkIfProductExists Latte = " + s2.checkIfProductExists(p1));
        System.out.println("where is latte? "+ s2.indexOfProduct(p1));

    }
}
