package day38;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListPractice_ShortWay {
    public static void main(String[] args) {
        //Create List of 6 doubles in short way

        List<Double> doubleNums = Arrays.asList(6.55,3.66,7.87,5.76,6.55);
        System.out.println(doubleNums);
        int count = 0;
        for(Double each: doubleNums){
            if(each>5){
                ++count;
            }
        }
        System.out.println("count of more than five is: "+count);

        ArrayList<Double> newPrices = new ArrayList<>(doubleNums);
        newPrices.add(199.99);
        newPrices.remove(6.55); //removes first one
        System.out.println(newPrices);

        //Creat an ArrayList object in one short wth many items so we can add or remove
        //One option of creating ArrayList object in one shot
        ArrayList<Double> oneShotPrice = new ArrayList<>(Arrays.asList(9.99,5.55,3.76,8.99));


    }
}
