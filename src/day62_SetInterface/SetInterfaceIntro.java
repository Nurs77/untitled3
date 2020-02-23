package day62_SetInterface;

import java.util.HashSet;
import java.util.Set;

public class SetInterfaceIntro {
    public static void main(String[] args) {

        //Set is a data structure to store unique elements:
        //HashSet implements Set interface and always default choice
        //IT DOES NOT KEEP INSERTION ORDER
        //IT DOES NOT HAVE INDEX


     //   HashSet<Integer> myNums1 = new HashSet<>();

        Set<Integer> myNums = new HashSet<>();

        myNums.add(10);
        myNums.add(60);
        myNums.add(50);
        myNums.add(30);
        myNums.add(30);
        myNums.add(20);
        myNums.add(20);
        System.out.println(myNums);

        System.out.println("myNums = " + myNums);

    }
}
