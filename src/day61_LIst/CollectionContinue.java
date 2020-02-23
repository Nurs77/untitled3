package day61_LIst;

import java.util.*;

public class CollectionContinue {
    public static void main(String[] args) {
        Collection<Integer> nums = new ArrayList<>();
        nums .addAll(Arrays.asList(1,6,3,5,2,3));
        System.out.println("nums = " + nums);
        // Can we use get method when we have Collection as reference type??
        //No!!!!!
        //Only reference type decide what we CAN access

        List<Integer> nums2 = new ArrayList<>(Arrays.asList(10,9,2,33,12));
        Collections.sort(nums2);
        System.out.println("nums2 = " + nums2);;

        
    }
}
