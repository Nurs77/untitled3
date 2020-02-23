package day38;

import java.util.*;

public class ReversingAList {
    public static void main(String[] args) {
        //reversing an ArrayList
        List<Integer> nums1=new ArrayList<>(Arrays.asList(200,100,700,400,500));
        //200 ,100,700,400,500
        //after reversing 500,400,700,100,200
        System.out.println("Original nums1 = \n\t" + nums1);
        //after sorting in reverse order line 11
        //700,500,400,200,100
        Collections.reverse(nums1);
        System.out.println("After reversing nums1 = \n\t" + nums1);
        Collections.sort(nums1, Comparator.reverseOrder());
        System.out.println("revesing in descending order was .sort first and then reverseOrder: \n\t" +nums1);
    }
}
