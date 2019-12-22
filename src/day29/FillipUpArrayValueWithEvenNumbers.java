package day29;

import java.util.Arrays;

public class FillipUpArrayValueWithEvenNumbers {
    public static void main(String[] args) {


        int[] numbers = new int[100];
                                // ====== \n will move it to next line =====
        System.out.println("Before filling up \n" + Arrays.toString(numbers));

        numbers[0]=0;
        numbers[1]=2;
//        .
//        .
//        .
//        .
        numbers[99]=198;

        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = i*2;

        }
        System.out.println("After flling up EVEN NUMBERS \n" + Arrays.toString(numbers));
    }
}
