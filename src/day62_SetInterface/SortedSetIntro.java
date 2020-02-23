package day62_SetInterface;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetIntro {
    public static void main(String[] args) {

        // SortedSet interface extends Set interface
        // it is a data structure that store unique elements in sorted order
        // The implementing class is TreeSet
        SortedSet<Integer> myNums = new TreeSet<>();

        myNums.add(10);
        myNums.add(60);
        myNums.add(50);
        myNums.add(30);
        myNums.add(30);
        myNums.add(20);
        myNums.add(20);
        System.out.println(myNums);

        System.out.println("myNums = " + myNums);
        System.out.println("lowest number: "+myNums.first());
        System.out.println("highest number: "+myNums.last());
        
    }
}
