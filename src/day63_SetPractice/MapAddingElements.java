package day63_SetPractice;

import java.util.HashMap;
import java.util.Map;

public class MapAddingElements {
    public static void main(String[] args) {
        Map<String,Integer> nameAgePair = new HashMap<>();
        nameAgePair.put("Nurs",24);
        nameAgePair.put("Tolgonai",22);
        nameAgePair.put("Islam",24);
        nameAgePair.put("Iska", 19);
        // if you put duplicate item it will OVERRIDE the previous values
        nameAgePair.put("Nurs",40);
        System.out.println("nameAgePair = " + nameAgePair);
        System.out.println("nameAgePair.size() = " + nameAgePair.size());
        System.out.println("Nurs's age = " + nameAgePair.get("Nurs"));
        nameAgePair.putIfAbsent("Nurs", 10);

        System.out.println("nameAgePair = " + nameAgePair);
        // getting the size of a map
        System.out.println("nameAgePair.size() = " + nameAgePair.size());

        // how do we get an value according to the key
        System.out.println("Nurs's Age = " + nameAgePair.get("Nurs"));

        // how do i check a key already exist or not
        // containsKey method
        System.out.println("nameAgePair.containsKey(\"Ruhksona\") = " + nameAgePair.containsKey("Islam"));
        System.out.println("nameAgePair.containsKey(\"NURS\") = " + nameAgePair.containsKey("NURS"));

        // Updating the element in the Map using replace
        nameAgePair.replace("Nurs", 17);
        System.out.println("nameAgePair.get(\"Nurs\") = " + nameAgePair.get("Nurs"));
        // why don't we just use put ?? what is the downside ?
        // If I dont have that key , it will just add new one and that's not what we want , we only want to update

        // updating the value only if the old value equals to a specified value
        // update Zehra's age to 9 if it was 17
        nameAgePair.replace("Nurs", 17, 10);
        System.out.println("nameAgePair.get(\"Nurs\") = " + nameAgePair.get("Nurs"));

        // Removing Entry  by the key
        nameAgePair.remove("Tolgonai");
        // try not to use get method to check you have the entry or not
        // because if you don't have the key you will get null
        // but you will also get null if the value was actually null -- {Fatih=Null}
        System.out.println("nameAgePair.get(\"Tolgonai\") = " + nameAgePair.get("Tolgonai"));
        System.out.println("nameAgePair.containsKey(\"Tolgonai\") = " + nameAgePair.containsKey("Tolgonai"));


    }
}
