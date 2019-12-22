package day25;

import java.util.Arrays;

public class String_Split_Method {
    public static void main(String[] args) {
        String sentence = "Everything is Awesome";


        //What does it do?
        //Split(bySomething) is a method of String that split string into multiple part
        //DO i need TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD?
        //YES, we need to tell what do we use while splitting, in this example space
        //What do I get out of it?
        //we get out String array

        String[] allWords = sentence.split("is");//splitting the sentence
        System.out.println("allWords = " + Arrays.toString(allWords));//putting the string in to array
        System.out.println("How many word do I have in this sentence? : " + allWords.length);//printing out the words in the array
        System.out.println(allWords[allWords.length-1]);//last word of the array

        for(String eachPieces:allWords){
            System.out.println("eachPieces <" + eachPieces +">");
        }
    }
}
