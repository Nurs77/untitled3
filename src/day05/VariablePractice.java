package day05;

public class VariablePractice {
    public static void main(String[] args) {

        /* 8 primitive
        line1
        line 2
        line3
        Block comment, eveything in between will be seen as comment

        whole numbers      : byte, short, int, long
        Fractional numbers : float, double
        logical            : boolean ( true , false )
        character          : char (single character in single quote)

        usually by default for whole numbers use :  int
        for fractional numbers use : double

        IS String part of Primitive type? NOOO!!!
        String is sequence of character

         */

        int birthYear = 2001;
        int currentYear = 2019;
        int age = currentYear- birthYear;
        //I was born in year 2001, and I am 18 years old

        System.out.println("I was born in year " + 2001 + ", and I am " + (2019-2001) + " years old");
        System.out.println("I was born in year " + birthYear + " , and I am " + age + " years old");

        // Task 2 : you are speeding today
        // speed limit is some number, and your current speed is this
        // generate this output of : you are driving 10mpg than the speed limit
        int currentSpeed = 75;
        int overTheLimit = 10;
        int speedLimit = currentSpeed - overTheLimit ;

        System.out.println("I was driving at 75mph where it was allowed to drive at " + speedLimit + "mp/h");

    }
}
