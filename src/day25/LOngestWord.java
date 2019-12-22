package day25;

import java.util.Arrays;

public class LOngestWord {
    public static void main(String[] args) {
        String sentence = "We are trying to find longest word";//String the sentence which we will split

        String[] allwords = sentence.split(" ");//splitting function
        System.out.println("allwords = " + Arrays.toString(allwords));//Putting the String into the array


        String longestWord = "";

        for(String currentWord:allwords){ //Created new String and applied Split words from the arrays to the loop to check

            if(currentWord.length()>longestWord.length()){ //if current.word will be bigger than longestword it will replcae it and loop untill
                //it checks all the splitted words
                longestWord = currentWord;
                
            }
        }
        System.out.println("longestWord = " + longestWord);
    }
}
