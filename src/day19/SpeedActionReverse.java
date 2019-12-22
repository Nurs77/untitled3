package day19;

import java.util.Scanner;

public class SpeedActionReverse {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter start and end");

        int start = scan.nextInt();

        int end = scan.nextInt();

        if (start < end) {
            System.out.println("Increasing the Speed");
            // I will increase the speed till i reach ending speed
            for (int i = start; i <= end; i++) {
                System.out.print(i + ",");
            }


        } else if (start > end) {
            System.out.println("Decreasing the speed");
            //I will decrease the speed till ending speed
            for (int x = start; x > end; x--) {
                System.out.print(x + ",");
            }

        } else {
            System.out.println("all good");
        }
    }
}
