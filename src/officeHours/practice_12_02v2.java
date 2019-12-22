package officeHours;

import java.util.Scanner;

public class practice_12_02v2 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String name = scan.nextLine();

        int x = 0;

        while(x< name.length()){
            System.out.println("index: " + x);
            System.out.println(name.charAt(x));
            ++x;



        }

        //while (x<15){
          //  System.out.println("Wola@");

       // }
        System.out.println("THE END");
    }
}
