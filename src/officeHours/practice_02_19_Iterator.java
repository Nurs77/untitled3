package officeHours;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class practice_02_19_Iterator {
    public static void main(String[] args) {
        List<Integer> lst = new ArrayList<>(Arrays.asList(20,30,103,20));

        Iterator<Integer> numIter = lst.iterator();

        System.out.println("numItr.hasNext() to check if we have element at next position \n \t"+numIter.hasNext());
        //System.out.println("numItr.next() will move the cursor to the next element and get the value \n \t"+numIter.next());
        while (numIter.hasNext()){
            System.out.println("numIter.next() = " + numIter.next());
        }
    }
}
