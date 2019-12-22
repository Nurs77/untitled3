package day26;

public class ArrayTask {
    public static void main(String[] args) {
        int[] score = {1321,521,532,56,321,643};
        String finalResult = ""; //if all numbers more than 100 then make it yes if not make it "no"
int kotok = score.length;
        System.out.println("kotok = " + kotok);
        //LOGIC 1 :
        // take each item check if it is less than 100, count in the end if count is more than 0, answer is No

        int countMoreThan100  = 0;
        for(int eachNum:score){
            if(eachNum>100){
                ++countMoreThan100;

            }
        }
        System.out.println("countMoreThan100 = " + countMoreThan100);

        if(countMoreThan100==score.length){
            finalResult="yes";
        }else{
            finalResult = "no";
        }

        System.out.println("finalResult = " + finalResult);
        // LOGIC 2
        //Check each item and break when number is less than 100 after assigning final result to NO
        System.out.println("================");
        int[] scores = {156, 101, 76, 187, 87, 110};
        int size = scores.length;
        System.out.println("size = " + size);

        String finalResult1 = "YES";

        for (int eachNum : scores) {

            if (eachNum <= 100) {
                finalResult1 = "NO";
                break;
            }

        }
        System.out.println("finalResult = " + finalResult1);


        // LOGIC 3;
        //minus 100 from all numbers in array and if any of the numbers are negative , it wil be no


        for (int i = 0; i <score.length ; i++) {

            
        }
    }
}
