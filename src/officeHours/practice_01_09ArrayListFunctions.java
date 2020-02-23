package officeHours;

import day21.SearchingSomethingInStringTwo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class practice_01_09ArrayListFunctions {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(1, 30);

        System.out.println(list.size());
        int num = list.get(1);
        System.out.println(num);

        list.clear();
        System.out.println("list size after clear function: " + list.size());

        List<String> list2 = new ArrayList<>();
        list2.add("A");
        list2.set(0, "B");
        list2.add("A");
        System.out.println("List contains: \n\t" + list2);


        System.out.println("Checking if the list has C: " + list2.contains("C")); // check if it contains the given object

        System.out.println("checking if the value is 0 = " + list2.isEmpty());

        System.out.println("Checking where is B is located at: " + list2.indexOf("B"));

        System.out.println("Chacking where is D is located: " + list2.indexOf("D"));

        List<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        System.out.println("Original list3 = " + list3);

        //
        // int a =1; Removes the index !!!!!!!!
        //Integer a2 = 1; // object removes!!!!!!!!!!!!!!!
        Integer a2 = 5;
        boolean r1 = list3.remove(a2);
        System.out.println("r1 = " + r1);


        list3.remove(a2);
        System.out.println("list3 after index 1 is removed = " + list3);

        List<String> list4 = new ArrayList<>();
        list4.add("A");
        list4.add("F");
        list4.add("D");
        list4.add("E");
        System.out.println("Original list4 = " + list4);
        list4.remove(2);
        System.out.println("after removal: " + list4);
//================= Conversion =====================
        System.out.println("==================");

        Integer[] nums = {1,2,3,4,5,6,7};
        List<Integer> list5 = Arrays.asList(nums);
        System.out.println(list5);

        String[] students = {"Nursultan","Irina","Dilshat","Nikolai"};
        //Conversion of Array String to ArrayList
        List<String> names = new ArrayList<>();
        Arrays.asList(students);
        names.addAll(Arrays.asList(students));

        List<String> cars = new ArrayList<>();
        cars.addAll(Arrays.asList("BMW","Jaguar","Tesla","Corolla","Honda"));
        System.out.println("cars original list  = " + cars);
        cars.retainAll(Arrays.asList("BMW","Jaguar","Tesla"));
        System.out.println("cars after removing some of them: "+cars);

        List<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ahmet","Eric","Ahmet","John","Aaron"));
        employees.removeAll(Arrays.asList( "Ahmet"));
        System.out.println("list after removing all Ahmets: "+employees);

    }

}
