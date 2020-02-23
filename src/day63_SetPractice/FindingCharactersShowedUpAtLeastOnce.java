package day63_SetPractice;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FindingCharactersShowedUpAtLeastOnce {
    public static void main(String[] args) {
        String str="As mentioned , new link has been sent to you on Thursday night with instruction. Look for email with Cybertek" +
              "B15 Online Java Course : Phase Two in Subject and follow the instruction";
      //  Set<Character> chars = new HashSet<>(Arrays.asList( ('A','A','A',)));
        // Instead of going through each and every character
        // I want to turn this String into a String array of each character
        // then turn it into a List with Arrays.AsList
        // eventually create a HashSet objecy by copying everything inside this list
        
       String[] eachCharStrArray =  str.split("");
        System.out.println("Arrays.toString(eachCharStrArray) = " + Arrays.toString(eachCharStrArray));
        List<String> charLst = Arrays.asList(eachCharStrArray);
        
        Set<String> charSet = new HashSet<>(charLst);
        System.out.println("charSet = " + charSet);
        
        //The one short way
        Set<String> charSetShortWay = new HashSet<>(Arrays.asList(str.split("")));
        System.out.println("charSetShortWay = " + charSetShortWay);
        


    }
}
