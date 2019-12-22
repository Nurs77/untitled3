package ReplPractice;

import java.util.Arrays;
import java.util.Scanner;

public class Practice {
 public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     String str = scan.nextLine();
     String[] splittedWords = str.split(" ");

     String shortest =splittedWords[0];

     for (String eachWord:splittedWords
          ) {
         if(eachWord.length()<shortest.length()){
             shortest=eachWord;
             if(shortest.length()==shortest.length()){

             }
         }
     }
     System.out.println(shortest+""+shortest+1);






 }
}
