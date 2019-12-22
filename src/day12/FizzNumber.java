package day12;

public class FizzNumber {
    public static void main(String[] args) {
        int num = 5;
        if(num%5==0 && num%3==0 ) {
            System.out.println("FIZZBUZZ");
        }else if(num%5 ==0){
            System.out.println("Fizz NUmber");
        }else if(num%3 ==0){
            System.out.println("BUzz Number");

        }
    }
}
