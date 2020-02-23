package day59_Exception_Continue;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionPractice {
    public static void main(String[] args) {

        System.out.println("The Start");
        String name = "Furkan";

        Scanner scan= new Scanner(System.in);
        System.out.println("Character at what index you want to get from Furkan's name? ");

        int targetIndex = scan.nextInt();
        try{

            System.out.println(name.charAt(targetIndex));
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("You are out of bound");
            System.out.println("Enter between 0 to "+name.length());
        }catch ( InputMismatchException bla){
            System.out.println("Input missmatch, enter number");
        }
//        System.out.println(name.charAt(targetIndex));
        System.out.println("name = " + name);
        System.out.println("The End");


        
    }
    
}
