package day25;

import java.util.Arrays;

public class CheckArrayIsSortedOrNot {
    public static void main(String[] args) {
        int[] nums = {13,23,13,53,21,531};
        System.out.println("nums " + Arrays.toString(nums));
        int numsItemCount =nums.length;
        int[] numsCopy = new int[numsItemCount];
        for (int x = 0; x < numsItemCount ; x++) {
            numsCopy[x] = nums[x];
        }
        System.out.println("BEfore sort = "+ Arrays.toString(numsCopy));
        Arrays.sort(numsCopy);
        System.out.println("After sort "+ Arrays.toString(numsCopy));
        if(Arrays.equals(nums,numsCopy)) {
            System.out.println("THIS ARRAY IS SORTED = ");
        }else{
            System.out.println("THis is not sorted");


        }
        //PLAIN ENGLISH LOGIC======
        //you copy this 7 number in to another container
        //sort the number

    }
}
