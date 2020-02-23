package day51;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PersonComparing {
    public static void main(String[] args) {
        Person p1 = new Person("Nursultan", 24);
        Person p2 = new Person("Topa", 22);
        Person p3 = new Person("Lubov", 2);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p2.compareTo(p1));
        System.out.println(p2.compareTo(p3));
        int result = p2.compareTo(new Person("Jon Snow", 27));
        System.out.println("result = " + result);
//        if(p1.compareTo(p3)==1){
//            System.out.println(p3.name);
//
//        }else{
//            System.out.println(p1.name);
//        }
        List<Person> lst = new ArrayList<>();
        lst.add(p1);
        lst.add(p2);
        lst.add(p3);
        lst.add(new Person("Jon Snow", 27));


        Collections.sort(lst);
        System.out.println("lst = " + lst);


    }

}
