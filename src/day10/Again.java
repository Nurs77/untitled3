package day10;

import java.util.Scanner;

public class Again {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Hey what season is it?");
        String season = scan.next();
        switch(season){
            case "Spring":
                System.out.println("Hike Easter");
                break;
            case "SUmmer":
                System.out.println("Swim and stuff");
                break;
            case "Fall":
                System.out.println("Black Friday");
                break;
            case "Winter":
                System.out.println("Snow");
                break;
            default:
                System.out.println("Error");


        }
        System.out.println("The season is " + season );
    }
}
