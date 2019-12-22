package day08;

import java.util.Scanner;

public class ifStatement {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        int speedLimit = 60;
        System.out.println("What is your current Speed? : ");
//        int currentSpeed = scan.nextInt();
//        if (currentSpeed <=60) {
//            System.out.println("You are good to go, please go shopping!");
//        } else {
//            System.out.println("you are fucked today");
//        }

        int speedLimitt = 60;
        int currentSpeedd = 75;
        boolean IamSpeeding = currentSpeedd>speedLimitt;
        if (IamSpeeding) {
            System.out.println("FUCKED HARD");

        } else {
            System.out.println("you good bro");
        }
        System.out.println("THE END SKA");
    }
}
