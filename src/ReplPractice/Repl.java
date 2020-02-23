package ReplPractice;



import java.util.Arrays;
import java.util.Scanner;

public class Repl {

    public static void plus_minus (int[] nums) {
        int positive=0, negative=0, zero=0;
        for (int eachNum: nums) {
            if (eachNum > 0) {
                positive++;
            }
            else if (eachNum < 0) {
                negative++;
            }
            else {
                zero++;
            }
        }
        System.out.println ("positives:" + positive + ", negatives:" + negative + " , zeros:" + zero);
    }

        public static void main(String[]args){
            Scanner inp = new Scanner(System.in);
            int size = inp.nextInt();
            int[] arr = new int[size];
            for (int i = 0; i <= size - 1; i++) {

                arr[i] = inp.nextInt();
            }

            plus_minus(arr);
        }//end main


    }
