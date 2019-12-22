package day08;


import java.util.Scanner;

public class MultiBranchifStatement {
    public static void main(String[] args) {
        //pseudo| sudo code
        /*  given your CUrrentSpeed, speedLimit

        check wheter the current speed is
        more than 90 --> jail
        more than 80 and less than 90 ---> reckless driving
        more than 70 and less than 80 ---> point taken
        more than 60 and less than 70 ---> warning\

        if not speeding keep driving

         */

        int speedLimit = 70;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your current speed idiot: ");
        int currentSpeed = scan.nextInt();
        if (currentSpeed >90) {
            System.out.println(" you are speeding more than 90 -----> DRIVER LICENCE termination idiot!");
            // Asking whether it's less than or equal 70 and more than 60
            // when you come to this point, your speed is already not more than 70

         } else if (currentSpeed>80) {
            System.out.println("your speed is more than 80 ---- point taken");

        }else if (currentSpeed>70) {
            System.out.println("your speed is more than 70 ---- warning");

        }else {
            System.out.println("Keep driving idiot");
        }

        System.out.println("Drive save fucking dick");

    }

}
