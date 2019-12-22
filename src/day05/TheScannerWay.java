package day05;

import java.util.Scanner;



public class TheScannerWay {
    public static void main(String[] args) {

        //ask user for name
        //capture the result
        //print your name is
        //ask user for birth year
        //and capture the result
        //print the age
        //ask user for height
        //and capture the result
        //print the height

        Scanner scan = new Scanner(System.in);

        System.out.println("What is your name : ");
        String name = scan.next();
        System.out.println("Thank you " + name + " for your time");

        System.out.println("Please type your birth year : ");
        int birthYear = scan.nextInt();
        int age = 2019 - birthYear ;

        System.out.println("Nursultan your age is " + age );

        System.out.println("Please type your height : ");
        double height = scan.nextDouble();
        System.out.println("Your height is " + height);



        System.out.println("Thank you for providing your information");
        System.out.println("We will contact you after reviewing your information");




    }

}
