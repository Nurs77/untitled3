package ReplPractice;

import java.util.Scanner;

public class Repl {
    public static void main(String[] args) {
Scanner scan = new Scanner(System.in);

        String word = scan.next();
        int charCount = word.length();

        if (charCount == 1) {
            System.out.println(word + word + word);

        } else if (charCount == 2) {

            System.out.println(word + word);

        } else if (charCount > 2) {
            // if the word character count is more than 2 then i worry about it's even or odd

            if (charCount % 2 == 1) {

                int indexOfMidCharacter = charCount / 2;
                System.out.println(word.charAt(indexOfMidCharacter));

            } else {

                int indexOfFirstHalf = charCount / 2 - 1;
                int indexOfSecondhalf = charCount / 2;

                System.out.println(word.charAt(indexOfFirstHalf) + "" + word.charAt(indexOfSecondhalf));

            }

        }

    }


}