package day64_MapContinue;

import java.util.Deque;
import java.util.LinkedList;

public class Deck_for_LIFO {
    public static void main(String[] args) {

        // How do we implement a lifoQueue if not using old class called Stack
        //We can use any Deque interface implementation
        // Deque is a double ended queue so we can add item as always
        // and when we remove we can use removeLast last method to achieve Last in First out


        Deque<String > lifoQue = new LinkedList<>();
        lifoQue.add("review class");
        lifoQue.add("poshel nahui");
        lifoQue.add("Zaibal");
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());
        System.out.println("lifoQue.removeLast() = " + lifoQue.removeLast());


    }
}
