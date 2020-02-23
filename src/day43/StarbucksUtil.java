package day43;

public class StarbucksUtil {




        public static void main(String[] args) {

            Coffee myCoffee = new Coffee("Blonde",5,1.6);
            printCoffeeInfo(myCoffee);
            String myString = new String("Hello");
            //printStringInfo(myString);
            //if it non-static the method at the bottom is used
//            StarbucksUtil util = new StarbucksUtil();
//            util.printStringInfo(myString);
            printStringInfo(myString);
            printStringInfo("abc");

            Coffee c1 = new Coffee();
            printCoffeeInfo(c1);
            printCoffeeInfo(new Coffee("intensito",4));


        }

        public static void printCoffeeInfo(Coffee co){
            System.out.println("This coffee is: "+ co.getType());
            System.out.println("Price is: "+ co.getPrice());
            System.out.println("Caffeine Level is : "+ co.getCaffeineLevel());

        }
/**
 * a static method to print out first and last character of a String
 * @param str
 *
 */
        public static void  printStringInfo(String str){
            System.out.println("First character is "+str.charAt(0));
            System.out.println("last character is "+ str.charAt(str.length()-1));

        }

    }
