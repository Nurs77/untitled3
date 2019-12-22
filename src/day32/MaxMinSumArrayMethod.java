package day32;

import java.util.Arrays;

public class MaxMinSumArrayMethod {
    public static void main(String[] args) {
        printArrayItems(new int[]{1, 6, 5, 3, 12, 3});
        int[] scores = {2, 5, 8, 23, 4, 5, 6};
        printArrayItems(scores);
        printMaxofIntArray(new int[]{1, 5, 2, 6, 33, 66, 2});
        printMinofIntArray(new int[]{5, 6, 2, 9, 7, 5, 4});
        sumOfAll(new int[]{1,2,3,4,5});
        compare2arraySize(new String[]{"Sezgin","Senay"}, new String[]{"Araz"});
    }

    public static void printArrayItems(int[] nums) {
        System.out.println("arrays has items: " + Arrays.toString(nums));
    }

    public static void printMaxofIntArray(int[] numbers) {
        int max = 0;
        for (int i = 0; i < numbers.length; i++) {

            if (max < numbers[i]) {
                max = numbers[i];

            }

        }
        System.out.println("max: "+ max);
    }

    public static void printMinofIntArray(int[] numbers) {
        int min = numbers[0];
        for (int i = 0; i < numbers.length; i++) {

            if (min > numbers[i]) {
                min = numbers[i];

            }

        }
        System.out.println("min: "+min);
    }
public static void sumOfAll(int[] numbers){
        int sum =0;
    for (int i = 0; i <numbers.length ; i++) {
        sum+=numbers[i];
    }
    System.out.println("the sum of the array "+Arrays.toString(numbers)+" is: " + sum);
}
public static void compare2arraySize(String[] arr1, String[]arr2){
        if(arr1.length>arr2.length){
            System.out.println("array 1 has more");
        }else if(arr1.length<arr2.length){
            System.out.println("array 2 has more");
        }else{
            System.out.println("same");
        }
}

}
