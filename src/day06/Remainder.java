package day06;

import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        /*System.out.println(5/2);
        System.out.println(5.0/2);
        System.out.println(5.0/2f);
        // 5 divided by 2 is 2 and remainder is 1
        System.out.println( 5%2 );

        System.out.println(99%10);

         */

        Scanner PIZDA = new Scanner(System.in);
        System.out.println("enter minutes : ");
        int minutes = PIZDA.nextInt();
        int hours = minutes / 60;
        int minuteRemain = minutes % 60 ;
        System.out.println("it will be " + hours + " hours");
        System.out.println("it will have a remainder of " + minuteRemain + " minutes");


    }
}
