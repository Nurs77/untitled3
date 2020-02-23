package day37;

import java.util.ArrayList;
import java.util.List;

public class PriceListPractice {
    public static void main(String[] args) {
        List<Double> priceList = new ArrayList<>();
        priceList.add(9.99);
        priceList.add(12.99);
        priceList.add(2.99);
        priceList.add(7.99);
        priceList.add(1.99);
        priceList.add(6.99);
        priceList.add(0.99);
        priceList.add(12.99);

        System.out.println("priceList = " + priceList);

        //change value, third value to 10$
        priceList.set(2,10.0);
        System.out.println("third item new price= "+priceList.get(2) );

// add 4$ to first value
        priceList.set(0, priceList.get(0)+4);
        System.out.println("After adding 4$ to first value "+ priceList.get(0));
// change last price to sum of first and second price
        Double sumOfFirst2Items = priceList.get(0) + priceList.get(0);
        priceList.set(priceList.size()-1,sumOfFirst2Items);
        System.out.println("New priceList = "+ priceList);
        // give 40% off to second price
        priceList.set(1,priceList.get(1)*0.6);
        System.out.println("After 40% second value item is " + priceList.get(1));
//double the value of each price
        for (int i = 0; i <priceList.size() ; i++) {
            priceList.set(i,priceList.get(i)*2);

        }
        System.out.println("price after doubling " +priceList);
        System.out.println();
        for (int i = 0; i < priceList.size() ; i++) {
            if(priceList.get(i)>=20){
                priceList.set(i, priceList.get(i)/2);

            }

        }
        System.out.println("After cutting the 20$ and more to half : \n \t" + priceList);


        //swap the first value with last
        Double temp = priceList.get(0);
        priceList.set(0, priceList.get(priceList.size()-1));
        priceList.set(priceList.size()-1,temp);
        System.out.println("after swapping first and last values " + priceList);

    }

}
