package day63_SetPractice;

import java.util.HashMap;
import java.util.Map;

public class WordFrequency {
    public static void main(String[] args) {
        String str = "Do it and find out Words Words Words";
        String[] allWords = str.split(" ");
        System.out.println("allWords.length = " + allWords.length);

        Map<String,Integer> wordFreMap = new HashMap<>();
        for(String currentWord: allWords){
            if(wordFreMap.containsKey(currentWord)==false){
                wordFreMap.put(currentWord,1);
            }else{
                wordFreMap.replace(currentWord,wordFreMap.get(currentWord)+1);

            }

        }
        System.out.println("wordFreMap = " + wordFreMap);

    }
}
