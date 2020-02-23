package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RetailAllPractice {
    public static void main(String[] args) {
        ArrayList<Integer> num1 = new ArrayList<>();
        num1.add(100);
        num1.add(200);
        num1.add(300);
        num1.add(400);
        num1.add(500);
        num1.add(600);
        
        System.out.println("num1 = " + num1);
        List<Integer> num2 = new ArrayList<>(Arrays.asList(200,300,600,700,800));
        System.out.println("num2 = " + num2);
        num1.retainAll(num2);
        System.out.println("num1 = " + num1);
num2.retainAll(num1);
        System.out.println("num2 = " + num2);
        System.out.println("Does num1 has same elements as num2?: " +num1.equals(num2));
        

    }
}
