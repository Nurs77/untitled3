package day25;

import java.util.Arrays;

public class TASK {
    public static void main(String[] args) {
        String name = "NURSULTAN";
        // turn this into charArray using toCharArray() method of String
        // toCharArray() is a method of String that turn string into char array
        char[] allCharsInName = name.toCharArray();

        for (char eachChar : allCharsInName) {
            System.out.println("eachChar = " + eachChar);
        }
        // WHAT DOES IT DO ?
        // toCharArray() is a method of String that turn string into char array
        // DO I NEED TO PROVIDE EXTRA DATA WHILE CALLING THE METHOD ?
        // NO
        // WHAT DO I GET OUT OF IT ?
        // char array object that has all the characters of the String object


        char[] allCharsInName1 = name.toCharArray();
        System.out.println("BEFORE SORTING allCharsInName = " + Arrays.toString(allCharsInName));
//        for (char eachChar : allCharsInName) {
//            System.out.println("eachChar = " + eachChar);
//        }
        // now count how many a we have
        int count = 0;
        for (char eachChar : allCharsInName1) {

                if (eachChar == 'a') {
                    ++count;
                }
            }

            System.out.println("count = " + count);

            // What if you want to sort all characters of your name
            // in alphabetical order ?
            Arrays.sort(allCharsInName1);
            System.out.println("AFTER SORTING allCharsInName = " + Arrays.toString(allCharsInName1));


        }


//        char[] namesChar = new char[name.length()];
//
//        //without a method
////        namesChar[0] = name.charAt(0);
////        namesChar[1]=name.charAt(1);
//        for (int x = 0; x < namesChar.length ; x++) {
//            //take each character of name and fill the array values
//            namesChar[x] = name.charAt(x);
//
//        }
//        System.out.println("My name consists of "+ namesChar.length+ " letters");
//        System.out.println("Arrays.toString(namesChar) = " + Arrays.toString(namesChar));

    }

