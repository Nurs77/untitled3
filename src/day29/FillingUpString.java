package day29;

import java.util.Arrays;

public class FillingUpString {
    public static void main(String[] args) {
        String[] javaLove = new String[300];

        for (int i = 0; i < javaLove.length ; i++) {
            javaLove[i] = i+ " =  times I love Java";


        }
        System.out.println( Arrays.toString(javaLove));
    }
}
