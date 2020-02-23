package day56;

import java.util.Arrays;
import java.util.List;

public class StoreTest {
    public static void main(String[] args) {
        Store s1 = new Store();
        System.out.println(s1.name);
        System.out.println(s1.allProducts);
        
        s1.allProducts.add(new Product("imac",3999));
        List<Product> teaStore = Arrays.asList(new Product("tea",4),
                new Product("cookies",6),
                new Product("coffee",5));
        Store s2 = new Store("Tea Store",teaStore);
        s2.allProducts.clear();
        System.out.println("s2 = " + s2);
        
    }
}
