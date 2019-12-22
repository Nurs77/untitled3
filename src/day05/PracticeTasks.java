package day05;

import java.util.Scanner;

public class PracticeTasks {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*System.out.println("Please enter the hours : ");
        int hours = scan.nextInt();
        int secondsInHour = hours * 3600;
        System.out.println("Hours will be " + secondsInHour + " seconds");

        System.out.println("What is the temperature in F ? ");

        double farenheit = scan.nextDouble();
        double celcius = (5.0/9)*(farenheit - 32) ;
        System.out.println(" Temperature " + farenheit + " will be in C : " + celcius );




         */

        System.out.println("What is your hourly wage? ");

        float wageInHour = scan.nextFloat();

        double salary = wageInHour * 2080;

        System.out.println("Your yearly salary based on the hourly wage rate of " + wageInHour + "$ is equal to " + salary + "$ per year");


/*
        float tomato = 2.99f;
        float potato = 3.49f;
        float banana = 1.99f;


        System.out.println("How many Tomato you bought? ");
        int amountT = scan.nextInt();
        System.out.println("How many Potato you bought? ");
        int amountP = scan.nextInt();
        System.out.println("How many Banana you bought? ");
        int amountB = scan.nextInt();
        float overallPrice = amountT * tomato + amountP * potato + amountB * banana;
        System.out.println("Your total spending is " + overallPrice + "$ for the whole shopping");


 */



    }
}
