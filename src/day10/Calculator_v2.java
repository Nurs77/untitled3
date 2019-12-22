package day10;

import java.util.Scanner;

public class Calculator_v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);



        int num1 = scan.nextInt();
        char operator = scan.next().charAt(0);
        int num2 = scan.nextInt();




        switch (operator){
            case '+':
                System.out.println(num1 + num2);
                break;
            case '-':
                System.out.println(num1 - num2);
                break;
            case '*':
                System.out.println(num1 * num2);
                break;
            case '/':
                System.out.println(num1 / num2);
                break;
            default:
                System.out.println("No SHIT IDIOT");
        }
    }
}
