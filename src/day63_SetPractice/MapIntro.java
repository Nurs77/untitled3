package day63_SetPractice;

import java.util.HashMap;
import java.util.Map;

public class MapIntro {
    public static void main(String[] args) {
        /*
        Compared to List, Set which store single element per item
        Map store key-value pair per item
        That's why we need Two data type inside <>
        one for the key one for the value
         */
        Map<String,String> nameAndStatePair = new HashMap<>();
        Map<Integer,String> groupNumLeaderNamePair = new HashMap<>();

        Map<String, Double> groceryNameAndPrice = new HashMap<>();

        Map<String, Boolean> voterAndEligibility = new HashMap<>();

        Map<String, Integer> gameAndScore = new HashMap<>();


    }
}
