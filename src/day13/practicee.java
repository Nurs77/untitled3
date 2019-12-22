package day13;

import java.util.Scanner;

public class practicee {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Do you want to shop");
        String doYouWantShop = scan.nextLine();
        String whichStore = scan.nextLine();


        if( doYouWantShop.equalsIgnoreCase("NO") ){

            System.out.println("Stay home and practice Java");

        }else if( doYouWantShop.equalsIgnoreCase("YES") ){



            System.out.println("How do you want to shop?");

        }String whereToShop = scan.nextLine();
        if(whereToShop.equalsIgnoreCase("Online") ){


            System.out.println(" In Amazon");

        }
        else if(whereToShop.equals("Store")){
            System.out.println(whichStore.equals("Gucci"));
            System.out.println("Go to Gucci store");
        }else {
            System.out.println("Dont waste my time");
        }

    }
}



