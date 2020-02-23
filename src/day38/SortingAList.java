package day38;

import java.util.*;

public class SortingAList {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>(Arrays.asList(300,700,600,500,400));
        System.out.println("NUms before sort: \n\t"+nums);
//======== Sorting the List with Collections.sort =========
        Collections.sort(nums);
        System.out.println("nums after sorting: \n\t " + nums);
        //======= Reverse mode Comparator.reverseOrder =========
        Collections.sort(nums, Comparator.reverseOrder());
        System.out.println("nums with reverse order = " + nums);
        nums.sort(Comparator.naturalOrder());
        System.out.println("nums normal sorting  = " + nums);

    }
}
