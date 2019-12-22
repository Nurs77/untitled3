package day06;

import java.util.Scanner;

public class CupturingMultipleWords {
    public static void main(String[] args) {

        Scanner sgein = new Scanner(System.in);
        System.out.println("What is your name? ");

        String name = sgein.nextLine();

        System.out.println("What is your street adress " + name + "?");


        String adress = sgein.nextLine();
        System.out.println("And what is your city?");
        String city = sgein.nextLine();
        System.out.println(name + " your address is " +adress + " located in city of " + city );
        System.out.println("Thank you for the valuable information!!");


    }
}
