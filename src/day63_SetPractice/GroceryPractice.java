package day63_SetPractice;

import java.util.*;

public class GroceryPractice {
    public static void main(String[] args) {
        Map<String,Double> groceryAndPractice = new HashMap<>();
        groceryAndPractice.put("tomato",3.99);
        groceryAndPractice.put("apple",4.99);
        groceryAndPractice.put("carrot",2.99);
        groceryAndPractice.put("cucumber",3.29);
        groceryAndPractice.put("meat",7.99);
        groceryAndPractice.put("banana",1.99);
        groceryAndPractice.put("banana",3.99);
        System.out.println("groceryAndPractice = " + groceryAndPractice);
        System.out.println(groceryAndPractice.putIfAbsent("meat",7.99));
        System.out.println("Carrot's price is: "+groceryAndPractice.get("carrot"));
        System.out.println("doubling the price of tomato: "+groceryAndPractice.get("tomato")*2);
        System.out.println("doubling the price of banana: "+groceryAndPractice.get("banana")*2);
        System.out.println("groceryAndPractice before removing = \t" + groceryAndPractice);
        if(groceryAndPractice.containsKey("tomato")){
            groceryAndPractice.remove("tomato");
            System.out.println("No More Tomato");
        }
        System.out.println("groceryAndPractice after removing and modifications = \t" + groceryAndPractice);



    }
}
