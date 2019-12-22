package day29;

import java.util.Arrays;

public class FillipUpArrayValue {
    public static void main(String[] args) {


        int[] numbers = new int[100];
                                // ====== \n will move it to next line =====
        System.out.println("Before filling up \n" + Arrays.toString(numbers));
        //without loop
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //with loop
        for (int i = 0; i <numbers.length ; i++) {
            numbers[i] = i+1;

        }

        System.out.println("After Filling up \n" + Arrays.toString(numbers));



    }
}
