package day22;

public class ArrayPractice {
    public static void main(String[] args) {
        double[] prices = new double[5];


        //can Not print out array variable directly
        // to see what's inside
        System.out.println(prices[0]);
        System.out.println(prices);

        prices[0] = 2.46;
        prices[1] = 5.66;
        prices[2] = 10.77;
        prices[3] = 132.22;
        prices[4] = 34.56;
        System.out.println("========");
        for (int i = 0; i <5 ; i++) {
            System.out.println(prices[i]);

        }
        System.out.println("================");
        // Create a char array that hold allthe letters from your first name
        //and assign values using each character of your first name

        char[] name = new char[9];

        name[0]='N';
        name[1]='u';
        name[2]='r';
        name[3]='s';
        name[4]='u';
        name[5]='l';
        name[6]='t';
        name[7]='a';
        name[8]='n';

        for (int i = 0; i <9 ; i++) {
            System.out.print(name[i]);


        }
        //EXCLUSIVE TO CHAR ARRAY IT WILL PRINT IT OUT
        System.out.println();
        System.out.print(name);

    }
}
