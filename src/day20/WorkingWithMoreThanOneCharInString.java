package day20;

public class WorkingWithMoreThanOneCharInString {
    public static void main(String[] args) {
        //given a String with even number of character count
        // print 2 characters in one line
        //for example ; Gokyuzum

        /*
        Go 01
        ky 23
        uz 45
        um 67

         */

        String name = "Gokyuzum";
        int charCount = name.length();
        int lastCharIndex = charCount-1;

        /*System.out.println( name.substring(0,2));
        System.out.println( name.substring(2,4));
        System.out.println( name.substring(4,6));

        System.out.println( name.substring(6,8));
         */

       for (int x=0; x<=lastCharIndex-1;x+=2){
           System.out.println(  name.substring(x,x+2));
       }

    }
}
