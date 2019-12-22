package day20;

public class Get2SiblingChar {
    public static void main(String[] args) {
        String name = "Ayra";

        /*System.out.println(name.substring(0,2));
        System.out.println(name.substring(1,3));
        System.out.println(name.substring(2,4));


         */

        int lastChar = name.length()-1;

        for (int x = 0; x<=lastChar-2 ; x++) {
            System.out.println(name.substring(x,x+3));

        }
    }
}
