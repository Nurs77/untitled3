package day63_SetPractice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        String str = "AAAABBBBBCCCCCDD";

        // Get the frequency and store into Map <Character, Integer>

        Map<Character, Integer> charFreq = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (!charFreq.containsKey(currentChar)) {
                System.out.println("Enter for the first time: "+ currentChar);
                charFreq.put(currentChar, 1);
            } else{
                charFreq.replace(currentChar,charFreq.get(currentChar)+1);
                
            }
        }
        System.out.println("charFreq = " + charFreq);

    }
}