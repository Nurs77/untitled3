package day37;

import java.util.ArrayList;
import java.util.List;

public class RemoveMethod {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>();
        lst.add(2);
        lst.add(22);
        lst.add(14);
        lst.add(7);
        lst.add(1);
        lst.add(8);
        System.out.println("List : " + lst);

       // lst.remove(2); First method by index


        lst.remove(Integer.valueOf(14));//second method by value
        System.out.println("List by removing third value = " + lst);

    }
}
