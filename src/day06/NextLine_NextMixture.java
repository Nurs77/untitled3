package day06;

import java.util.Scanner;

public class NextLine_NextMixture {
    public static void main(String[] args) {
        Scanner kotok = new Scanner(System.in);

        System.out.println("What is your name ? ");
        String name = kotok.nextLine();
        System.out.println("Your name is " + name);

        System.out.println("WHat is your age ? ");
        int age = kotok.nextInt();
        kotok.nextLine();
        System.out.println("Your age is " + age);

        System.out.println("What is your address? ");
        String address = kotok.nextLine();
        System.out.println("Your address is " + address);





    }
}
