package ReplPractice;

import day39.Student;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

    }
    public static ArrayList<Integer> appenPossum(ArrayList<Integer> ints){
        int sum=0; // creating sum variable
        ArrayList<Integer> output = new ArrayList<>(); // creating new ArrayList to store positive numbers

        for (int i = 0; i <ints.size() ; i++) { //for loop to check for positive numbers
            if(ints.get(i)>0){ // creating if statement to check for numbers more than 0 and leave negative numbers

                output.add(ints.get(i)); // adding all positive numbers to the new ArrayList created above
                sum +=ints.get(i); // adding all the positive numbers to the sum variable created

            }

        }
        output.add(sum); // adding sum to our ArrayList, that will be stored at the end of the List
        return output; // returning our new created ArrayList with the positive numbers and the SUM
    }

}
