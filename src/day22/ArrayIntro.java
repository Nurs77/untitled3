package day22;

public class ArrayIntro {
    public static void main(String[] args) {

        // Syntax for creating variable and assigning value
        // dataType variableName = value here
        int num1 = 10;
        System.out.println("num1 = "+ num1);
        //syntax for creating variable to store mutiple items
        // and assigning a values
        // dataType [] variableName = new dataType[ count of time ] ;
        // this array can hold 4 items, it is also known as array size
        int[] scores = new int[4];
        scores[0] = 5;
        scores[1] = 70;
        scores[2] = 88;
        scores[3] = 100;
        System.out.println(  scores[0]   );
        System.out.println(  scores[1]   );
        System.out.println(  scores[2]   );
        System.out.println(  scores[3]   );
        System.out.println("======");
     //Updating the value at certain index
       scores[1] = 99;
        System.out.println(scores[1]);
        //Once array is created with certain size, we CANNON CHANGE THE SIZE "int[] scores = new int[4];"

        //when you create new Array object
        //it will get default value in ecah element
        int[] numbers= new int[3];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        System.out.println("=================");

        byte data[]= new byte[4];
        data[0]=127;
        data[1]=30;
        data[2]=40;
        data[3]=50;


        for (int i = 0; i <4 ; i++) {
            System.out.println(data[i]);
        }
        data[3] = 77;

    }
}
