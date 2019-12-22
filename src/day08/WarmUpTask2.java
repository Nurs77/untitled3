package day08;

import java.util.Scanner;

public class WarmUpTask2 {
    public static void main(String[] args) {

        Scanner word = new Scanner(System.in);



        System.out.println("Please guess my number :");

        int myFavNumber = word.nextInt();

        if (myFavNumber == 8) {
            System.out.println("BINGO ENEN SGEIN");
        } else {
            System.out.println("Eban ne ugadal ");

        }

    }
}
