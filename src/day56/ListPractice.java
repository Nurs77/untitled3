package day56;

import java.util.ArrayList;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(12);
        nums.add(4);
        nums.add(1);
        nums.add(70);
        nums.add(90);
        nums.add(10);
        System.out.println("nums = " + nums);
        System.out.println("nums.contains(10) = " + nums.contains(10));
        System.out.println("nums.indexOf(70) = " + nums.indexOf(70));



    }
}
