package day34;

import day31.calculator;

import java.util.Arrays;

public class MathActionMethod {
    public static void main(String[] args) {

        //call your build3DigitNumber


        int result1 = PracticeMethodWithNumbers.building3DigitNumber(6,4,0);
        System.out.println("result1 = " + result1);
        int [] nums = {2,5,87};
        System.out.println("Arrays to string(nums " + Arrays.toString(nums));
//how can I call static method calculate in Calculator under day31 package
        calculator.calculate(10,20,'-');

    }
}
