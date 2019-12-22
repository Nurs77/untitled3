package day12;

import java.util.Scanner;

public class TASK5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your season please: ");
        String season = scan.next();
        if(season.equalsIgnoreCase("spring")){
            System.out.println("HIKING,NAVRUZ");
        }else if(season.equalsIgnoreCase("summer")){
            System.out.println("Pool, swimming");

        }else if(season.equalsIgnoreCase("fall")){
            System.out.println("barbecue, riding bike");
        }else if(season.equalsIgnoreCase("winter")){
            System.out.println("code and shit");
        }else {
            System.out.println("get the hell out of here");
        }


    }
}
