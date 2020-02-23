package day58_Exceptions_RunTimeError;

import java.util.ArrayList;
import java.util.List;



// OUT OF MEMORY ERROR EXAMPLE
                    //THIS ERROR HAPPENS WHEN HEAP MEMORY IS FULL
  /* Normally if we keep creating objects, or if we have One object that is very large
  Example :
        ArrayList object with many elements



INTERVIEW QUESTION:
CHECKED EXCEPTIONS MUST HANDLED OR DECLARED BY THE PROGRAMMER FOR THE CODE TO COMPILE. OTHERWISE CODI WILL NOT COMPILE
 */



public class OutOfMemoryDemo {
    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i >0 ; i++) {
//            System.out.print(i);
            nums.add(i);


        }
    }
}
