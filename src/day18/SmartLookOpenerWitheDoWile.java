package day18;

import java.util.Scanner;

public class SmartLookOpenerWitheDoWile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("KNOCK KNOCK!!!");


        String password;

        do{

            System.out.println("What'st the password");
            password=scan.next();

        }while(! password.equals("B15"));
        System.out.println("Door is open");


        }








    }

