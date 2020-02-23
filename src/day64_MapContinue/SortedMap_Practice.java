package day64_MapContinue;

import java.util.HashMap;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMap_Practice {
    public static void main(String[] args) {
        SortedMap<String,Double> groceryAndPrice = new TreeMap<>();
        
        groceryAndPrice.put("tomato",3.99);
        groceryAndPrice.put("apple",4.99);
        groceryAndPrice.put("carrot",2.99);
        groceryAndPrice.put("cucumber",3.29);
        groceryAndPrice.put("meat",7.99);
        groceryAndPrice.put("banana",1.99);
        groceryAndPrice.put("banana",3.99);
        System.out.println("groceryAndPrice = " + groceryAndPrice);

        // INTERVIEW QUESTION
        // Difference between HashMap, LinkedHashMap, TreeMap
        /*
        HashMap default implementation: faster, no insertion order, no sorted order
        LinkedHashMap extends HashMap: slightly slower, keep insertion order, no sorted order
        TreeMap: SortedMap Implementation: slowest, no insertion order, keep sorted order

         */

        // Difference between HashMap and HashSet
                // HashSet is implementation of Set interface store unique elements per item
            // HashMap is implementation of Map interface it store key pair -- key are unique
         // Two completely different data structure

        // Difference between HashMap, LinkedHashMap, TreeMap




    }
}
