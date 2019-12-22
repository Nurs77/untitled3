package day25;

import java.util.Arrays;

public class StringtoCharArray {
    public static void main(String[] args) {
        String name = "NURSULTAN";
        char[] namesChar = new char[name.length()];
        
        //without a method
//        namesChar[0] = name.charAt(0);
//        namesChar[1]=name.charAt(1);
        for (int x = 0; x < namesChar.length ; x++) {
            //take each character of name and fill the array values
            namesChar[x] = name.charAt(x);
            
        }
        System.out.println("Arrays.toString(namesChar) = " + Arrays.toString(namesChar));
        
    }
}
