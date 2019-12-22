package day24;

import java.util.Arrays;

public class ArraysClassMethod {
    public static void main(String[] args) {
        //Arrays class a class coming from java.util package
        //it has a lot of pre-built method to work with array object

        // for printing the content of the array
        //toString ---> Arrays.toString(yourArrayHere)

        //for sorting an Array in ascending order
        // sort ---> Arrays.sort(yourArrayHere)

        //for checking for equality of 2 array object content
        //equals ---> Arrays.equals(firstArray,secondArray)
        //This method will give you string representation of any type of array
        //the result will look ---> [item1, item2, item3....lastItem]

        String[] superHeroes = {"Superman", "Batman","Wonder Woman", "Aquaman", "Cyborg"};
        System.out.println(Arrays.toString(superHeroes));
        String superHeroAsString = Arrays.toString(superHeroes);
        System.out.println(superHeroAsString);
//============HOW DO WE GET FIRST CHARACTER OF superHeroAsString VARIABLE
        System.out.println(superHeroAsString.charAt(0));

        int[] numbers = {10,44,55,3,78};
        System.out.println(" Arrays . to String(numbers) result ");
        System.out.println(Arrays.toString(numbers));
        System.out.println("==============");
// create an double array of 3 items ; and put 3 value
// get a string representation out of this array and save it as pricesString
// print each and every character in this String  in this format
//  character at index 1 is :  yourCharacterHere
//  character at index 2 is :  yourCharacterHere and so on all the way till last
        double[] prices = {10.43,86.45,21.86};
        String pricesString = Arrays.toString(prices);
        System.out.println(pricesString);

        for (int i = 0; i <pricesString.length() ; i++) {
            int index =0;
            System.out.println(" Your character at the index " + i +  ": -> " + pricesString.charAt(i));

        }


    }
}
