package day03;

public class PrimitivePracice {

    public static void main(String[] args) {

        int catCount = 20;

        byte letterCount = 26;

        short sheepCount = 300;

        long mileToMoon  = 500000L;
        long mileToSun   = 1000000L;

        // ------------ floating point ---------------

        float priceOfBanana = 1.99f; // you mus add f at the end of the number to indicate it is a float
        // uppercase, lowercase doesn't matter
        float priceOfPotato = 2.49F;

        //======== Larger floating point numbers =========

        double priceOfIpad1   = 355.99d;
        double priceOfIpadPro = 1024.99D;
        double priceOfMac     = 2299.99;

        // if you have a whole number itself , compiler automatically assume it is an int
        // if you have a fractional number itself , compiler automatically assume it is a double

        System.out.println("The letter count is " + letterCount);
        System.out.println("The sheep count is " + sheepCount);
        System.out.println("The miles to Moon is " + mileToMoon);
        System.out.println("The miles to Sun is " + mileToSun);
        System.out.println("The price of a Banana is " + priceOfBanana);
        System.out.println("The price of a Potato is " + priceOfPotato);
        System.out.println("The price of iPad 1 is "  + priceOfIpad1);
        System.out.println("The price of iPad Pro is " + priceOfIpadPro);
        System.out.println("The price of Mac is " + priceOfMac);



    }
}
