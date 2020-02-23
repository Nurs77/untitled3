package day37;

import java.util.ArrayList;
import java.util.List;

public class MethodWithArrayListAsReturnType {
    public static void main(String[] args) {

        System.out.println(getListFrom1TillFinalNumber(7));
        List<Integer> myList = getListFrom1TillFinalNumber(9);
        System.out.println(myList);
    }


    public static List<Integer> getListFrom1TillFinalNumber(int finalNumber) {
        List<Integer> nums = new ArrayList<>();
        for (int numbers = 1; numbers <= finalNumber; numbers++) {
            nums.add(numbers);
        }
        // System.out.println(nums);
        return nums;

    }
}
