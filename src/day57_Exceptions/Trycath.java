package day57_Exceptions;

public class Trycath {
    public static void main(String[] args) {
        System.out.println("before try catch");
        try{
            int result = 10/0;
        }catch (ArithmeticException e){
            System.out.println("Exception hap[pende, and was caught and handled");

        }
        System.out.println("After try catch");

    }
}
