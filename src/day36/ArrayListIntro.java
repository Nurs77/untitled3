package day36;

import java.util.ArrayList;
import java.util.List;

public class ArrayListIntro {
    public static void main(String[] args) {
        // How do we create Arrayist
        ArrayList<String> list1 = new ArrayList<>();
        //ArrayList<int> list2 = new ArrayList<>();//It will NoT store priminitive

        //Correct way to create arayList object that store whole number
        // to use wrapper class type . Primitive type is FORBIDDEN!!!!

        ArrayList<Integer> list = new ArrayList<>();

        ArrayList<Long> list3 = new ArrayList<>();

        ArrayList<Double> list5 = new ArrayList<>();

        List<String> myList = new ArrayList<>();

    }
}
