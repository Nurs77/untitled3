package day06;

public class PreIncrementDecrementOperator {
    public static void main(String[] args) {

        int offerCount = 1000;
        /*offerCount +=1;
        ++offerCount;
        System.out.println("Offer now " + offerCount);


        */
        ++ offerCount;
        System.out.println("Offer now after increasing by one " + offerCount);
        offerCount -= 50;
        System.out.println("Offer now after decreasing by one " + offerCount );

    }
}
