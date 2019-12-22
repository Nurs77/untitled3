package day11;


import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please what you want");

        String targetOption = scan.next();
        switch(targetOption) {
            case "Bd":
                System.out.println("You turned on Bedroom light");
                break;
            case "Lr":
                System.out.println("YOu turned on Living Room light");
                break;
            case "Ki":
                System.out.println("You turned on kitchen light");
                break;
            case "Ha":
                System.out.println("You turned on hallway light");
                break;
            default:
                System.out.println("NO NO");


        }


    }
}
