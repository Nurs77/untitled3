package officeHours;

import java.util.Arrays;

public class practice_12_09 {
    public static void main(String[] args) {
        int num = 9;
        num = 15;
        System.out.println(num);

        int [] nums = new int[3];
        nums[0]=5;
        nums[1]=num;
        nums[2]=25;
        System.out.println(Arrays.toString(nums));
        System.out.println("How many numbers in array? " + nums.length);
        System.out.println(nums[1]);
        //to get last index of Array we need to length-1
        System.out.println("Last value in array: " +nums[nums.length-1]);
        //how to find middle value?
        System.out.println("Middle value is: " + nums[nums.length/2]);
        int[] newNums = new int[] {1,3,4,5,7};
        System.out.println("Middle value is : "+newNums[newNums.length/2]);
        //how to find biggest number?
        // let's infer that 1st value is the largest one

        int max = newNums[0];
        int secondMax = newNums[0];
        ;
        int min = newNums[0];
        for (int index = 0; index < newNums.length; index++) {
            //if any value is grater than current max
            if (newNums[index] > max) {
                //change max variable to this value
                max = newNums[index];
            }
            //same thing but we are excluding max number
            if (newNums[index] > secondMax && newNums[index] != max) {
                //change max variable to this value
                secondMax = newNums[index];
            }
            //how to find minimum value
            if (newNums[index] < min) {
                min = newNums[index];
            }
        }
        System.out.println("Max is: " + max);
        System.out.println("Second max is: " + secondMax);
        System.out.println("Min is: " + min);
    }
}
