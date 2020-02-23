package officeHours;

import java.util.Arrays;

public class practice_12_30 {
    public static void main(String[] args) {

        int a = 10;
        Integer A = a;
        //   Double A2 = a;  // Double is only dedicated to double

        float f = 0.5f;
        // Double F = f;   // each wrapper classes are dedicated to thier own primitives


        Double num1 = 0.5;
        Short num3 = 45;
        Integer num4 = 100;

        double num2 = num4;
        System.out.println(num2);


        Long number1 = 100L; // Auto

        Float f1 = 100.0f;


        double d1 = f1; // unboxing

        System.out.println(Byte.MAX_VALUE); // maximum value of byte primitive
        System.out.println(Byte.MIN_VALUE); // Minimum value of primitve Byte

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);



        String str1 = "123";
        Integer resut = Integer.parseInt(str1);
        System.out.println(resut+1);
        String str2 = "true";
        boolean r1 = Boolean.parseBoolean(str2);
        System.out.println(r1);

        String str3 = "FaLsE";
        boolean r2 = Boolean.parseBoolean(str3);
        System.out.println(r2);

        String str4 = "Yes or No";
        boolean r3 = Boolean.parseBoolean(str4);
        System.out.println(r3);

        String s1 = "100.5";
        double d4 = Double.parseDouble(s1);
        double d2 = Double.valueOf(s1);

        System.out.println(d4+1);
        System.out.println(d2+1);

        Boolean[] arr = new Boolean[3];
        System.out.println(Arrays.toString(arr));

        System.out.println(addNum(100.23,20.2));

    }
    public static int addNum(int a, int b){
        return a+b;

    }
    public static double addNum(double a, double b){

        return a+b;
    }
}
