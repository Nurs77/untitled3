package day06;

import java.util.Scanner;

public class ScannerCapturingMultipleWord {
    public static void main(String[] args) {
        Scanner kotok = new Scanner(System.in);
        System.out.println("What is your name? ");
        String name = kotok.next();
        int age = kotok.nextInt();

        System.out.println("Your beautiful name is " + name);
        System.out.println("And your age is " + age );
        System.out.println("You are an amazing person with a huge " +
                "potential please keep up the good work and you will succeed");



    }
}
