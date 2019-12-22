package day22;

import jdk.swing.interop.SwingInterOpUtils;

public class LooingThroughAnArrayInReverseOrder {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("num1 = "+ num1);

        int[] scores = new int[4];
        scores[0] = 5;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;

        int elementCount = scores.length ;
int lastItemIndex = elementCount-1;
        for (int x = lastItemIndex; x >=0 ; x--) {
            System.out.println("index location  " + x);
            System.out.println(scores[x]);


        }


    }
}
