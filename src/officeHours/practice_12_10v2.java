package officeHours;

import java.util.Arrays;
import java.util.Scanner;

public class practice_12_10v2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter language that you know : ");

        String l1 = scan.next();
        String l2 = scan.next();
        String l3 = scan.next();


        String [] languages = {l1,l2,l3};
        System.out.println(languages[2]);
// =====print all values=============
        System.out.println(Arrays.toString(languages));

        System.out.println("===========");
//============for each loop ======
        for(String lan : languages){
            System.out.println(lan);
        }
        System.out.println("================");
//=============for loop reverse ============
        for (int languageIndex = 2; languageIndex >=0 ; languageIndex--) {
            System.out.println(languages[languageIndex]);

        }
    }

}
