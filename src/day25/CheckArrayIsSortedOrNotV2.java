package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNotV2 {
    public static void main(String[] args) {
        //int[] nums = {1,2,3,4,5,6,7};
        int[] nums = {13,31,7,3,21,2,9};
boolean isSorted = true;


        System.out.println("nums " + Arrays.toString(nums));
//pick first item and compare with second item
        //keep repeating untill there is no more item

        for (int x = 0; x < nums.length-1 ; x++) {
            //System.out.println(nums[x]+" "+ nums[x+1]);
            System.out.println("is " + nums[x]+ " less than "+nums[x+1]+" -->   " +(nums[x]<nums[x+1]));
            if(!(nums[x]<nums[x+1])){
                System.out.println("Array is not sorted");
                isSorted = false;
                break;
            }
        }
        System.out.println("isSorted = " + isSorted);
    }
}
