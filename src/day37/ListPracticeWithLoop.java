package day37;

import java.util.ArrayList;
import java.util.List;

public class ListPracticeWithLoop {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <=100 ; i++) {
            nums.add(i);



        }
        System.out.println(nums);
        //change all the odd number value to 0
        for (int i = 0; i <nums.size() ; i+=2) {
           // System.out.println("Odd values are at index= " +i);
            nums.set(i,0);
        }
        System.out.println("Odd values are at index= \n" +nums);

        //how to find index of 20
        System.out.println("Index of 20 is at = " + nums.indexOf(20));

        //insert 100 to first index
        nums.add(0,100);
        System.out.println("nums after adding 100 to first index = \n" +nums);

        System.out.println("Index of 20 after adding 100 is at = " + nums.indexOf(20));


        List<Integer> lst2 = new ArrayList<>();
        lst2.add(44);
        lst2.add(14);
        lst2.add(34);
        lst2.add(41);
        lst2.add(19);
// insert 100 right after 34 : WE DO NOT KNOW WHERE IS 34 :
        lst2.add(lst2.indexOf(34)+1,100);
        System.out.println(lst2);
        for (int i = 0; i <5 ; i++) {
            lst2.add(0,100);
        }
        System.out.println(lst2);
    }
}
