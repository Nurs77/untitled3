package day64_MapContinue;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapContinue {
    public static void main(String[] args) {
        Map<String,Double> groceryAndPrice = new HashMap<>();
        groceryAndPrice.put("tomato",3.99);
        groceryAndPrice.put("apple",4.99);
        groceryAndPrice.put("carrot",2.99);
        groceryAndPrice.put("cucumber",3.29);
        groceryAndPrice.put("meat",7.99);
        groceryAndPrice.put("banana",1.99);
        groceryAndPrice.put("banana",3.99);
        System.out.println("groceryAndPrice = " + groceryAndPrice);

        Set<String> allNames = groceryAndPrice.keySet();
        System.out.println("allNames = " + allNames);
        allNames.remove("tomato");
        System.out.println("allNames after removing = " + allNames);
        System.out.println("grocery after removing = "+groceryAndPrice);

        //Get a copy of set into different object

        Set<String> namesCopy = new HashSet<>(allNames);
        namesCopy.remove("tomato");

        System.out.println("namesCopy = " + namesCopy);






    }
}
