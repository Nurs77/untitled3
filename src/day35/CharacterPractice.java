package day35;

import java.util.Arrays;

public class CharacterPractice {
    public static void main(String[] args) {
        System.out.println("IS DIGIT PRACTICE");
        System.out.println( Character.isDigit('A'));
        System.out.println( Character.isDigit(' '));
        System.out.println( Character.isDigit('6'));

        String str = "A34B12C4x";
        String numInStr = "";
        for (int x = 0; x <str.length() ; x++) {

            if(Character.isDigit(str.charAt(x))){
                System.out.println("str.charAt("+x+") = "+ str.charAt(x));
                numInStr += str.charAt(x);
            }

        }


        String[] sum = numInStr.split("");
        int summ= 0;
        for (int i = 0; i < sum.length; i++) {
            summ+=Integer.parseInt(sum[i]);

        }

        System.out.println("sum is: "+summ);

    }
}
