package day39;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPracticeProductList {
    public static void main(String[] args) {


        ArrayList<String> productList = new ArrayList<>(Arrays.asList
                ("iPhone 6s,449,18.71",
                        "iPhone 6s Plus,549,22.88",
                        "iPhone X,1149,56.16",
                        "MacbookPro,1499.99,79.49",
                        "ThumbDrive,39.99,2.68",
                        "Beats HeadPhones,349.99,15.12",
                        "Mous,79.99,8.98",
                        "Charger,39.99,4.56",
                        "iPad,429,18.31",
                        "Dyson Vacuum,399,16.25",
                        "TV,2199,89.49",
                        "Apple Watch,559,21.18"));
        System.out.println("Product list " + productList);
        System.out.println("product element count: "+productList.size());

        String itemDetails = "iPhone 6s,449,18.71";
        String[] itemSplit = itemDetails.split(",");
        
        System.out.println("Item name = "+ itemSplit[0]);
        Double price = Double.parseDouble(itemSplit[1]);
        System.out.println("price = " + price);
       Double monthly = Double.parseDouble(itemSplit[2]);
        System.out.println("monthly = " + monthly);
      for(String eachProduct: productList){
          String namePart = eachProduct.split(",")[0];
          System.out.println("eachProduct = " + namePart);

      }
        for (int i = 0; i < productList.size() ; i++) {
            String namPartt = productList.get(i).split(",")[0];
            System.out.println("namPartt = " + namPartt);

        }
        // =========== Task2 = Print all the prices that more than 500$ ===========
        for(String eachProduct:productList){
            double price1 = Double.parseDouble(eachProduct.split(",")[1]);

            if(price1>500){
                System.out.println("price: " + price1);
            }
        }
        System.out.println("================");
        // ================= Task 3 : print average ==================
        double sum = 0;
        double average = 0;
        for(String eachProduct:productList) {
            double price1 = Double.parseDouble(eachProduct.split(",")[1]);
            sum = sum+price1;



        }
        System.out.println("sum = " + sum);
        average = sum/productList.size();
        System.out.println("Average = "+average);
        System.out.println("=============");
        //==========Print all item names that has less than20$ monthly payments
        for(String eachProduct:productList) {
            String name = eachProduct.split(",")[0];
            double monthly1 = Double.parseDouble(eachProduct.split(",")[2]);
            if(monthly1<20){
                System.out.println(name+ ": " + monthly1);


            }
        }
        System.out.println("=============");
        // ================= print only Iphones with monthly payments =========
        for(String eachProduct:productList) {
            String name = eachProduct.split(",")[0];
            double monthly1 = Double.parseDouble(eachProduct.split(",")[2]);
            if(name.contains("iPhone")){
                System.out.println(name+": "+monthly1);
            }
        }
        // ============= Print all Information about most expensive item =============
        System.out.println("============");
        double maxPrice = Double.parseDouble(productList.get(0).split(",")[1]);
        int maxPriceIndex = 0;
        for (int i = 0; i < productList.size() ; i++) {
            String priceStr = productList.get(i).split(",")[1];
            double price1 = Double.parseDouble(priceStr);
            if(price1>maxPrice){
                maxPrice = price1;
                maxPriceIndex = i;
            }

        }
        System.out.println("MaxPrice at Index = " + maxPriceIndex);
        System.out.println("Max price = " + maxPrice);
        System.out.println("expensive item detail = " + productList.get(maxPriceIndex));
        System.out.println("===== Update Dyson price to 80% off=========");

        // ======== task 7 ===========
        System.out.println(productList.contains("Dyson"));
        System.out.println(productList.indexOf("Dyson"));
        int dysonIndex = 0;
        for (int i = 0; i < productList.size() ; i++) {
            if(productList.get(i).startsWith("Dyson")){
                dysonIndex = i;
            }

        }
        System.out.println("dysonIndex = " + dysonIndex);
        String dysonDetail = productList.get(dysonIndex);
        
        String name = dysonDetail.split(",")[0];
        double priceDyson = Double.parseDouble(dysonDetail.split(",")[1]);
        double monthlyDyson = Double.parseDouble(dysonDetail.split(",")[2]);
        dysonDetail = name + ","+ priceDyson*0.2 +","+ monthlyDyson*0.2;
        System.out.println("dyson details: " + dysonDetail);
        productList.set(dysonIndex,dysonDetail);
        System.out.println("Updated productList = " + productList);

        //============task8 ===========
        System.out.println("======= Count the items prices more than average price =======");

        int countMore = 0;
        for(String eachProduct:productList){
            double price1 = Double.parseDouble(eachProduct.split(",")[1]);
            if(price1>average){
                ++countMore;

            }
        }
        System.out.println("count of items that more than average " + countMore);

        //============= task 9 ===============
        System.out.println("=======Remove all the items with prices more than average=======");
        for (int i = 0; i <  productList.size(); i++) {
            double price1 = Double.parseDouble(productList.get(i).split(",")[1]);
            if(price1>average){
                productList.remove(i);
                --i;

            }

        }
        System.out.println("Product count after removing = " + productList.size());
        System.out.println("Updated product list: " +productList);

        ArrayList<String> itemNames = new ArrayList<>();
        ArrayList<Double> prices = new ArrayList<>();
        ArrayList<Double> monthlyPayments = new ArrayList<>();



        for(String eachProduct: productList) {

            // Store the name part into itemname the list

            itemNames.add(eachProduct.split(",")[0]);
            //store the name price into price list
            double pricePart = Double.parseDouble(eachProduct.split(",")[1]);
            prices.add(pricePart);

            double monthlyPart = Double.parseDouble(eachProduct.split(",")[2]);
            monthlyPayments.add(monthlyPart);



        }
        System.out.println("Item names = " + itemNames);
        System.out.println("Prices = " + prices);

        System.out.println("Monthly part = " + monthlyPayments);

        }
    }

