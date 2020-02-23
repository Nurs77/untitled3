package day56;

import java.util.ArrayList;
import java.util.List;

public class Store {
    //I added this name as new requirement so we can identify our store by name
    String name; // adding a field so we can give a name to Store objeect when we create one
   List<Product> allProducts; // store has List of products

    public int findSumOfAllProductPrice(){ // finding the sum with using loop
        int sum=0;
        for(Product each: allProducts){
            sum+=each.getPrice();
        }
        return sum;

    }
    public double getAveragePrice(){
        return findSumOfAllProductPrice()/getProductCount(); //sum divide by count of the products

    }
    public Product getMostExpensiveProduct(){
        Product maxProduct = null;
        int max = Integer.MAX_VALUE;
        for(Product each: allProducts){
            if(each.getPrice()>max){
                max= each.getPrice();
                maxProduct = each;

            }

        }
        return maxProduct;

//        int maxIndex = -1;
//        for (int i = 0; i < allProducts.size() ; i++) {
//            if(allProducts.get(i).getPrice()>max){
//                max=allProducts.get(i).getPrice();
//                maxIndex=i;
//            }
//        }
//        System.out.println("max = "+ max);
//        return allProducts.get(maxIndex);
    }

    public void addProduct(Product p){
        System.out.println("calling addProduct(Product p)");
        allProducts.add(p);

    }
    public int getProductCount(){ // Counting how many items we have in the store
        return allProducts.size();

    }
    public void displayAllProducts(){
        System.out.println("Store has products below: ");
        for(Product each: allProducts){
            System.out.println("\t each = "+ each);
        }
    }

    public boolean checkIfProductExists(Product p){
        return allProducts.contains(p);
    }
    public int indexOfProduct(Product p){
        return allProducts.indexOf(p);
    }
    public void removeProduct(Product p){
        if(checkIfProductExists(p)==true){
            allProducts.remove(p);
        }else{
            System.out.println("We don't have +"+p);
        }
    }

    public void addProduct(String productName, int productPrice){
        Product newP = new Product(productName, productPrice);
        allProducts.add(newP);
    }
    public Store(){
        this.name = "Cybertek Store";
        this.allProducts = new ArrayList<>();

    }
    public List<Product> getALllProductsMOreThanAveragePrice(){
        List<Product> myList = new ArrayList<>();
        double average = getAveragePrice();
        for (Product each: allProducts){
            if(each.getPrice()>average){
                myList.add(each);
            }
        }
        return myList;

    }
    // 2 Arg constructor to  accept List<Product>
    //First line of contreuctor should call no arg constructor to reuse initialization logic
    public Store(String name, List<Product> otherList){
        this();

        this.name = name;
        allProducts.addAll(otherList);


    }

    @Override
    public String toString() {
        return "Store{" +
                "name='" + name + '\'' +
                ", allProducts=" + allProducts +
                '}';
    }
}
