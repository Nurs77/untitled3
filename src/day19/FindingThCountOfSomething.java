package day19;

public class FindingThCountOfSomething {
    public static void main(String[] args) {


        // from 1-100 print out all the numbers can be divided by 15 without remainder
        //from 1-100 count how many numbers can be divided by 15
        int counter = 0;
        for (int i = 1; i <= 100; i++) {
            if (i % 15 == 0) {
                System.out.println(i);
                counter += 1;
            }
        }
        System.out.println("counter = " + counter);

String name= "Esra Fidan";

       int countofA =0;

for (int x = 0; x < name.length() ; x++) {
            System.out.println(   name.charAt(x)   );
            if (name.charAt(x)=='a') {
                //xSystem.out.println("Bingo FOUND IT");


                ++countofA;
            }
        }
        System.out.println("countofA = " + countofA);





    }
}
