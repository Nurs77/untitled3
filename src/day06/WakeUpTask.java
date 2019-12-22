package day06;

import java.util.Scanner;

public class WakeUpTask {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        System.out.println("What is the price? ");
        double regularPrice = scan.nextDouble();

        System.out.println("What is the discount?");
        double discount = scan.nextDouble();

        double salePrice = regularPrice - (regularPrice * discount);
        System.out.println(" your discounted price is " + salePrice + "$");


    }
}
