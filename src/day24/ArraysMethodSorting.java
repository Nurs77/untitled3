package day24;

import java.util.Arrays;

public class ArraysMethodSorting {
    public static void main(String[] args) {
        int[] scores = {99,44,66,23,19,55};
        System.out.println(Arrays.toString(scores));
        //For sorting an array in ascending order
        //sort ---> Arrays.sort(yourArrayHere)

        Arrays.sort(scores);
        System.out.println(Arrays.toString(scores));
        System.out.println("first item value: " + scores[0]);
        char[] nameChars = {'A','G','.','D','Z','9','B', };
        System.out.println("BEFORE SORTING Arrays.toString(nameChars) = " + Arrays.toString(nameChars));
        Arrays.sort(nameChars);
        System.out.println("AFTER SORTING Arrays.toString(nameChars) = " + Arrays.toString(nameChars));
        //the low to high order for character is decided by it's ascii table value
        // special characters comes first, number, uppercase then lowercase
boolean[] fiveSwitchOnOffs = {true, false , false , true };
        System.out.println("Arrays.toString(fiveSwitchOnOffs) = " + Arrays.toString(fiveSwitchOnOffs));


    }
}
