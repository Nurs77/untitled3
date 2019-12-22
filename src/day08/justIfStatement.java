package day08;

import java.util.Scanner;

public class justIfStatement {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("WHat is your current speed, dear driver : ");
        int currentSpeed = scan.nextInt();
        System.out.println("What is the speed limit");
        int speedLimit = scan.nextInt();

        if (currentSpeed >= speedLimit) {
            System.out.println("FUcked in the ass");
            System.out.println("GO to the court IDIOT");

        }

        System.out.println("MOVE ON WITH YOUR LIFE DICKHEAD");



    }
}
