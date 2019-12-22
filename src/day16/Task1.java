package day16;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner kot = new Scanner(System.in);
        String word1;
        System.out.println("Enter  4 letter word");
        word1 = kot.next();

        String word2 = "" + word1.charAt(3)+word1.charAt(2) + word1.charAt(1) +word1.charAt(0);
        System.out.println(word2);

        String msg = "Hello ";
        msg += "World!";
        System.out.println("msg = " + msg);



    }
}
