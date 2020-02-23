package day63_SetPractice;

import java.util.HashSet;
import java.util.Set;

public class UniqueFinding {
    public static void main(String[] args) {
        String str ="As mentioned , new link has been sent to you on Thursday night with instruction. Look for email with " +
                "Cybertek B15 Online Java Course : Phase Two in Subject and follow the instruction";
        //How many unique characters?
        
        Set<Character> charSet = new HashSet<>();
        for (int i = 0; i <str.length() ; i++) {
            charSet.add(str.charAt(i));
            
            
        }

        System.out.println("how many characters overall? : "+ str.length());
        System.out.println("how many unique characters? = " + charSet.size());
        System.out.println("charSet = " + charSet);
        for (Character eachChar : charSet){
            System.out.println(" each Unique Char = "+ eachChar);

        }


    }
}
