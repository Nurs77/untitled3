package day64_MapContinue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapKeySet {
    public static void main(String[] args) {
        Map<String,Double> groceryAndPrice = new HashMap<>();
        groceryAndPrice.put("tomato",3.99);
        groceryAndPrice.put("apple",4.99);
        groceryAndPrice.put("carrot",2.99);
        groceryAndPrice.put("cucumber",3.29);
        groceryAndPrice.put("meat",7.99);
        groceryAndPrice.put("banana",1.99);
        groceryAndPrice.put("banana",3.99);

        System.out.println("groceryAndPrice.get(\"apple\") = " + groceryAndPrice.get("apple"));

        Set<String> allNames = groceryAndPrice.keySet();
        for (String eachName: allNames){
            System.out.println("eachName = " + eachName);
        }
        
    }
}
