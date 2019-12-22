package day07;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner email = new Scanner(System.in);

        System.out.println("Please Enter your First Name, Last Name, and Company seperated by space");
        String firstName = email.next();
        String lastName = email.next();
        String company = email.next();

        String emaill = firstName +"_"+lastName+"@"+company+".com";

        System.out.println(emaill);



        System.out.println("My name is " + firstName +" "+lastName + " and my email is " + emaill);

    }
}
