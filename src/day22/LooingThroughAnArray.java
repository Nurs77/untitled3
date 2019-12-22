package day22;

public class LooingThroughAnArray {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println("num1 = "+ num1);

        int[] scores = new int[4];
        scores[0] = 5;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        System.out.println(  scores[0]   );
        System.out.println(  scores[1]   );
        System.out.println(  scores[2]   );
        System.out.println(  scores[3]   );

        int itemCount = scores.length;
int lastItemIndex = itemCount-1;

        for (int i = 0; i < itemCount ; i++) {
            System.out.println(scores[i]);

        }
    }
}
