package day22;

import day06.UsingValueOfOtherVariables;

public class LoopControlStatement {
    public static void main(String[] args) {
        String str = "I struggle with Java I like Java I love Java Everything is Awesome@";


//        for (int i = 0; i <=str.length()-1 ; i++) {
//            char currentChar = str.charAt(i) ;
//            if ( i%2==1 ) {
//                continue;
//            }
//            if(currentChar=='a') {
//                break;
//            }
//
//            System.out.print(currentChar);
//        }
//                 ========     TASK 1======
//        int charCount = str.length();
//        System.out.println("charCount = " + charCount);
//
//        for (int idx = 0; idx < charCount; idx++) {
//
//            if(idx%2==1){
//                continue;
//            }
//
//            System.out.println(idx+ "  :   " + str.substring(idx,idx+1));
//
//        }
//
//        //=================TASK 2========
//        for (int idx = 0; idx < charCount; idx++) {
//            String currentChar = str.substring(idx, idx+1);
//            if(currentChar.equalsIgnoreCase("a")){
//                break;
//
//            }
////            System.out.println("currentChar = " + currentChar);
////
////        }
        //=======COMBINED========

        int charCount = str.length();
        System.out.println("charCount = " + charCount);

       for (int idx = 0; idx < charCount; idx++) {
//     THis is the code to skip odd number index letters
           if(idx%2==1){
               continue;//this line will skip the rest and move to next iteration
           }
           //this is stroing each character as String
           String currentChar = str.substring(idx, idx+1);
           //this is checking the currentChar is J or j
           if(currentChar.equalsIgnoreCase("J")){
               break;//this is stop the loop
           }
           //printing out index index and the character at that index
           System.out.println(idx+ " index currentChar = " + currentChar);

       }
    }
}
