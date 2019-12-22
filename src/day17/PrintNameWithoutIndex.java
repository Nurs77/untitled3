package day17;

import java.util.Scanner;

public class PrintNameWithoutIndex {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Your Name!");
        String name = scan.nextLine();

        int x=0;
        //x<=name.lenght()-1 meaning:
        //Starting from 0 until last index

        //x<name.lenght() meaning:
        //Starting from 0 till right before the count of characters


        while(  x < name.length()) {
            if(x%2==1){
                System.out.println(x);
            }
            ++x;
        }
    }
}
