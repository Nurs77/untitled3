package day60_Exception_Continue;

import java.util.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public class IteratingAnyCollection {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>(Arrays.asList(10,4,5,2,32,1));
        Iterator<Integer> myIter = nums.iterator();
//        System.out.println("myIter.hasNext() = " + myIter.hasNext());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        System.out.println("myIter.next() = " + myIter.next());
//        try{
//            System.out.println("myIter.next() = " + myIter.next());
//        }catch (NoSuchElementException e){
//            System.out.println("NoSuch Element exception is handled");
//        }
//        System.out.println("The end");
        System.out.println("nums = " + nums);
        System.out.println("============");
        while (myIter.hasNext()){
            if(myIter.next()<=10){
                myIter.remove();
            }
        }
        System.out.println("nums = " + nums);
    }
}
