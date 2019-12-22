package day22;

public class MultiplicationTable {
    public static void main(String[] args) {

        //System.out.println("1 x 1 = " + 1*1);
        //System.out.println("1 x 1 = " + 1*2);
       // System.out.println("1 x 1 = " + 1*3);
//        System.out.println("====MULTIPLICATION TABLE FOR 1=====");
//        for (int base = 1; base <=12 ; base++) {
//
//            System.out.println("1 x " + base +" = " + 1*base);
//
//        }
//        System.out.println("====MULTIPLICATION TABLE FOR 2=====");
//        for (int base = 1; base <=12 ; base++) {
//
//            System.out.println("2 x " + base +" = " + 2*base);
//
//        }
//        System.out.println("====MULTIPLICATION TABLE FOR 2=====");
//        for (int base = 1; base <=12 ; base++) {
//
//            System.out.println("3 x " + base +" = " + 3*base);
//
//        }

        // This loop is for iterating number from 1 to 10
        for( int timesTable =1;timesTable<=10;timesTable++){
            // I want to know whic number I want to get multiplication table
            System.out.println("=======MULTIPLICATION TABLE "+ timesTable);
            // this loop will generate multiplication table for ne number
            for (int base = 1; base <=12 ; base++) {

                System.out.println(timesTable+ " x " + base +" = " + timesTable*base);

            }

        }


    }
}
