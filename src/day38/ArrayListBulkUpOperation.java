package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListBulkUpOperation {
    public static void main(String[] args) {
        List<String> groceries = Arrays.asList("Eggs","Milk","Butter","Apple");
        System.out.println("groceries= " +groceries);

        ArrayList<String> newLst = new ArrayList<>(groceries);
        newLst.add("Diet Coke");
        newLst.add("Sugar");
        System.out.println("NewLst= " + newLst);
        List<String> newItemsTOAdd = Arrays.asList("Pasta","Asparagus");
       newLst.addAll(newItemsTOAdd);
        System.out.println("NEW NEW LIST: \n\t"+newLst);




        ArrayList<Integer>num1 = new ArrayList<>();
        num1.add(123);
        num1.add(124);
        num1.add(126);
        num1.add(124);
        num1.add(122);
        num1.add(113);
        num1.add(4);
        ArrayList<Integer>num2 = new ArrayList<>();
        num2.add(5);
        num2.add(7);
        num1.addAll(num2);
        System.out.println("Num1 combined All to num2: \n"+ num1);

        num2.addAll(Arrays.asList(100,200,300,400));
        System.out.println("num2 with new data = " + num2);

    }
}
