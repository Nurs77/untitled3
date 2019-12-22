package day26;

import java.util.Arrays;

public class StringSplitPractice {
    public static void main(String[] args) {
        String students  = "Abbos, Zulyar, Zhibek, Hasan,Muge, Orhan,Susan";
students = students.replace(" "  , "");
        String[] namesArrays = students.split(",");//splitting the sentence

        System.out.println("Arrays.toString(allWords) = " + Arrays.toString(namesArrays));
        System.out.println("Length of Array" + namesArrays.length);
int studentCount = namesArrays.length;


        for (int x = 0; x <  studentCount; x++) {
            String name = namesArrays[x];
            System.out.println("Spelling that name = " + name);
            for (int i = 0; i <name.length() ; i++) {
                System.out.print(name.charAt(i)+"-");


            }
            System.out.println();
        }



//        String name = "NURSULTAN";
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
//        System.out.println("Arrays.toString(namesChar) = " + Arrays.toString(namesChar));
//


    }
}
