package day50.Task;

import java.util.Arrays;
import java.util.List;

public class MathTest {
    public static void main(String[] args) {
        Addition q1 = new Addition(10,90);
        System.out.println("q1 = " + q1);
        q1.calculate();
        System.out.println("q1 = " + q1);


        System.out.println("============");


        Substraction s1 = new Substraction(10,90);
        System.out.println("s1 = " + s1);
        s1.calculate();
        System.out.println("s1 = " + s1);


        System.out.println("===========");


        Substraction s2 = new Substraction(90,10);
        System.out.println("s2 = " + s2);
        s2.calculate();
        System.out.println("s2 = " + s2);


        System.out.println("=============");


        Multiplication m1 = new Multiplication(10,2);
        System.out.println("m1 = " + m1);
        m1.calculate();
        System.out.println("m1 = " + m1);

        System.out.println("==============");


        Division d1 = new Division(10,0);
        System.out.println("d1 = " + d1);
        d1.calculate();
        System.out.println("d1 = " + d1);

        System.out.println("====================================");
        List<Question> allTestQuestion = Arrays.asList(q1,s1,s2,m1,d1);
        for(Question each: allTestQuestion){

        }

    }
}
