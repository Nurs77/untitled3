package day56;

import java.util.Arrays;
import java.util.List;

public class StorePart3 {
    public static void main(String[] args) {

        List<Product> teaStore = Arrays.asList(new Product("tea",4),
                new Product("cookies",6),
                new Product("coffee",5));
        Store s2 = new Store("Tea Store",teaStore);

        System.out.println("s2 = " + s2);
        System.out.println("s2.findSumOfAllProductPrice() = " + s2.findSumOfAllProductPrice());
        System.out.println("s2.getAveragePrice() = " + s2.getAveragePrice());
       s2.getMostExpensiveProduct();
        System.out.println("s2.getALllProductsMOreThanAveragePrice() = " + s2.getALllProductsMOreThanAveragePrice());


    }
}
