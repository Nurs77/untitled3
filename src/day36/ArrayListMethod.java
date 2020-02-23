package day36;

import java.util.ArrayList;

public class ArrayListMethod {
    public static void main(String[] args) {

        ArrayList<Long> list = new ArrayList<>();

        //add item, insert item, read item, update item, remove item, check the location ....

        list.add(100L);
        list.add(200L);
        list.add(1000L);
        System.out.println(list);
        //counting size
        System.out.println("the size of the Array is "+list.size());
        //gettig the first item
        System.out.println("the first item is  "+ list.get(0));
        System.out.println("Sum is "+ (list.get(0)+list.get(1)+list.get(2)));
        //with loop method
        long sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println("SUm is with using for loop is " + sum);

    }
}
