package day56;

import java.util.ArrayList;
import java.util.List;

public class ProductListPractice {
    public static void main(String[] args) {
        List<Product> productList = new ArrayList<>();
        productList.add(new Product("Macbook Pro",2999));
        productList.add(new Product("Sony Tv",999));
        productList.add(new Product("Macbook Air",1299));
        productList.add(new Product("iPhone X",899));
        productList.add(new Product("iPhone XR",699));
        productList.add(new Product("Samsung 10",1188));


        System.out.println("productList.size() = " + productList.size());
//        boolean result = false;
//        for(Product each: productList){
////            if(each.getName().equals("Sony Tv")&&each.getPrice()==999){
////                result = true;
////            }
//            if(each.equals( new Product("Sony Tv",999))){
//                result=true;
//            }
//        }


        Product sony = new Product("Sony Tv",999);

        boolean result = productList.contains(sony);

        System.out.println("Has sony or not = "+result);
        System.out.println("productlist.indexOf(sony) before "+ productList.indexOf(sony));

        productList.remove(sony);
        System.out.println("Has Sony Tv after removing? =" + productList.contains(sony));
        System.out.println("productlist.indexOf(sony) after "+ productList.indexOf(sony));

    }
}
