package day61_LIst;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedList;
import java.util.List;

public class List_LinkedListImplementation {
    public static void main(String[] args) {
        List<String> lst = new LinkedList<>();
        lst.add("Nursultan");
        lst.add("Tolgonai");
        lst.add("Hochet");
        System.out.println("lst = " + lst);

    }
}
