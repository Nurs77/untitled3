package day64_MapContinue;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Map_entrySet_view {
    public static void main(String[] args) {
        Map<String, Double> groceryAndPrice = new HashMap<>();
        groceryAndPrice.put("tomato", 3.99);
        groceryAndPrice.put("apple", 4.99);
        groceryAndPrice.put("carrot", 2.99);
        groceryAndPrice.put("cucumber", 3.29);
        groceryAndPrice.put("meat", 7.99);
        groceryAndPrice.put("banana", 1.99);
        groceryAndPrice.put("banana", 3.99);



        Set<Map.Entry<String, Double>> entryView = groceryAndPrice.entrySet();
        for(Map.Entry<String,Double> each: entryView){
            System.out.println("Key for current entry is "+each.getKey());
            System.out.println("Value for current entry is "+ each.getValue());
            if(each.getKey().length()==5){
                each.setValue(15.0);
            }
        }
        System.out.println("groceryAndPrice = " + groceryAndPrice);
    }
}
