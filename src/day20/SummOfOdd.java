package day20;

public class SummOfOdd {
    public static void main(String[] args) {
        int sum = 0;


 /*
        sum = sum +1;   //1
        sum = sum +2;   //3
        sum = sum +3;   //6
        sum = sum +4;   //10
        sum = sum +5;   //15
        sum = sum +6;   //21
        sum = sum +7;   //28
        sum = sum +8;   //36
        sum = sum +9;   //45
        sum = sum +10;  //55


  */
        for (int i = 10; i <= 100; i++) {

            if (i % 2 == 0) {

                sum = sum + i;
            }

        }
        System.out.println("sum = " + sum);

    }
}
