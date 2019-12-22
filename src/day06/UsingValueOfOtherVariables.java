package day06;

import java.util.Scanner;

public class UsingValueOfOtherVariables {
    public static void main(String[] args) {
        /*int myFavouriteNumber = 300;
        int yourFavouriteNumber =  myFavouriteNumber ;
        System.out.println("My favorite Number " + myFavouriteNumber);
        System.out.println("Your favorite number" + yourFavouriteNumber);

        yourFavouriteNumber = 100;
        System.out.println("My favorite Number " + myFavouriteNumber);
        System.out.println("Your favorite number" + yourFavouriteNumber);



        //Create a variable called yourOrder, type String and assign a value
        //Optionally assign this value using Scanner
        //Create another variable called my order and assign the value
        // to same value as yourOrder by copying
        //and just print them out.

        String yourOrder = "Chocolate Crepes";
        String myOrder = yourOrder;
        System.out.println(" My order is " + yourOrder);
        System.out.println(" Your order is " + myOrder);


         */

        Scanner input = new Scanner(System.in);
        System.out.println("What is your order? I want the same! ");
        String yourOrder = input.nextLine();
        String myOrder = yourOrder ;

    }
}
