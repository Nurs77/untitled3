package day26;

import java.util.Arrays;

public class ReverseAnArrayBySwapping {
    public static void main(String[] args) {

        int[] myNumbers = new int[]{5,1,21,2,13,8,6,3,521,321,42353,53,432,5,436,2,64,3,53,2,8,9};
        int size = myNumbers.length;
        int lastIndex = size-1;
int middleIndex = size/2;
        //just to see what inside, we are not doing anything with String
        System.out.println(Arrays.toString(myNumbers));
        System.out.println(  myNumbers[0] + "---"+myNumbers[lastIndex-0] );
        System.out.println(  myNumbers[1] + "---"+myNumbers[lastIndex-1] );
        System.out.println(  myNumbers[2] + "---"+myNumbers[lastIndex-2] );

        System.out.println("====loop here=====");
        for (int x = 0; x <middleIndex ; x++) {
            System.out.println(myNumbers[x]+"---"+myNumbers[lastIndex-x]);
            int temp = myNumbers[x];
            myNumbers[x]=myNumbers[lastIndex-x];
            myNumbers[lastIndex-x]=temp;


        }
        System.out.println("After swap complete "+Arrays.toString(myNumbers));

    }
}
