package day36;

import java.util.Arrays;

public class MethodWithParamaeterArray {
    public static void main(String[] args) {

        int[] nums = {1,5,6,4,7,2};
        System.out.println("before sort nums= " + Arrays.toString(nums));
        Arrays.sort(nums);
        System.out.println("After sorting= "+Arrays.toString( nums));
        System.out.println("Before change nums= "+Arrays.toString(nums));
        changeArraysFirstItemTo100(nums);
        System.out.println("after change nums= " +Arrays.toString(nums));


    }
    public static void  changeArraysFirstItemTo100(int[] numbers){
        numbers[0]=100;
    }
}
