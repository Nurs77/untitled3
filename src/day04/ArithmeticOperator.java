package day04;

public class ArithmeticOperator {

    public static void main(String[] args) {
       // System.out.println( 5 + 3.0d);
        //System.out.println( 5 - 3.0d);
        //System.out.println(5*3.0d);
        //System.out.println(5/3.0f);

        int numberOfChicken = 5;
        double numberOfMonkey = 3.0d;
        float numberOfSgein = 3.0f;

        double result1 = numberOfChicken + numberOfMonkey;
        double result2 = numberOfChicken - numberOfMonkey;
        double result3 = numberOfChicken * numberOfMonkey;
        double result4 = numberOfChicken / numberOfMonkey;
        float result5 = numberOfChicken / numberOfSgein;

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);

        double celsius1 ;
        double fahrenheit1 = 75;
        celsius1 = (5.0/9) * ( fahrenheit1 - 32) ;

        System.out.println("What is the weather like right now? : " + celsius1);



    }
}
