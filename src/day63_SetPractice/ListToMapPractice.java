package day63_SetPractice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ListToMapPractice {
    public static void main(String[] args) {
        /*
        Abraham Hope
        Zelinskiy Ronaldo
        Seda Civan
        Nursn Demir
        Murat Kilinic
        Hakan Durmus
        Mariia Luianenko
        Birginigar Ozyurt
         */

        List<String> names = new ArrayList<>();
        names.add("Abraham Hope");
        names.add("Zelinskiy Ronaldo");
        names.add("Nursn Demir");
        names.add("Murat Kilinic");
        names.add("Mariia Luianenko");
        names.add("Birginigar Ozyurt");
        names.add("Seda Civan");

        Map<String, Integer> nameCharCountPair = new HashMap<>();

        for (String eachMember : names) {
            nameCharCountPair.put(eachMember, eachMember.length());
        }
        System.out.println("nameCharCountPair = " + nameCharCountPair);

    }
}
