package day64_MapContinue;

import java.util.*;

public class Map_valuesViewLambda {
    public static void main(String[] args) {
        Map<String, Double> groceryAndPrice = new HashMap<>();
        groceryAndPrice.put("tomato", 3.99);
        groceryAndPrice.put("apple", 4.99);
        groceryAndPrice.put("carrot", 2.99);
        groceryAndPrice.put("cucumber", 3.29);
        groceryAndPrice.put("meat", 7.99);
        groceryAndPrice.put("banana", 1.99);
        groceryAndPrice.put("banana", 3.99);


        Collection<Double> allPrices = groceryAndPrice.values();
        System.out.println("allPrices = " + allPrices);


        //List<Double> pricesCopy = new ArrayList<>(allPrices);
        allPrices.removeIf(eachPrice-> eachPrice>4); // SHORT LAMBDA LOGIC
        System.out.println("groceryAndPrice = " + groceryAndPrice);

        // the logic is to use the strict connection between the view and the original map
        // iterate over the allPrices and check the condition for more than 3 or not
        // if it is more than 3 then remove
        // Con Not Remove Elements Inside For Each Loop
        // So Only Option Other Than removeIf method is to use Iterator

        Iterator<Double> itr = allPrices.iterator();
        while(itr.hasNext()){
            if(itr.next()>4){
                itr.remove();
            }
        }
        System.out.println(" grocery map = " + groceryAndPrice);





    }
}
