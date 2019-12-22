package day18;

import java.util.Scanner;

public class SmartLookOpener   {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK!!!");
        System.out.println("What's the PASSWORD ? ");

        String password = scan.next();

        while(!password.equals("B15")){
            System.out.println("WRONG PASSWORD!! TRY AGAIN!!!");
            password= scan.next();

        }

        System.out.println("Open Sesame!!!");


    }
}
