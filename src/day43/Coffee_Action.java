package day43;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Coffee_Action {
    public static void main(String[] args) {
        Coffee c1 = new Coffee();
        c1.setType("Turkish");
        c1.setCaffeineLevel(8);
        c1.setPrice(-4.99);
        System.out.println("c1 = " + c1);
//        Coffee c2 = new Coffee("Intensito",9);
//        System.out.println("c2 = " + c2);
//
        Coffee c3 = new Coffee("Blonde",5,1.6);
        c3.setPrice(-100);
        System.out.println("c3 = " + c3);


        Coffee c4 = new Coffee("Latte",3,-2.6);
        System.out.println("c4 = " + c4);

                
        

//        Scanner scan = null;
//        Coffee cx = null;


        List<String> lst = new ArrayList<>();
        lst.add("abc");
        lst.add(null);
        lst.add(null);
    }
}
