package day17;

public class FizzByzzNumber {
    public static void main(String[] args) {
       /* int num = 25;

        if(num%5==0 && num%3 ==0){
            System.out.println(num + " is Fizz Buzz NUmber");
        }else if(num%5==0){
            System.out.println(num + " is Fizz Number");
        }else if(num%3==0){
            System.out.println(num + " is Buzz Number");
        }else{
            System.out.println("Not BOTH of them");
        }


        */
        int num =1;
        while (num<=50){

            if(num%5==0 && num%3 ==0){
                System.out.println(num + " is Fizz Buzz NUmber");
            }else if(num%5==0){
                System.out.println(num + " is Fizz Number");
            }else if(num%3==0){
                System.out.println(num + " is Buzz Number");

            }
            ++num;
        }

    }
}
