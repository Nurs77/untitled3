package day35;

import org.w3c.dom.ls.LSOutput;

public class WrapperTypePrimitiveTypeConversion {
    public static void main(String[] args) {
        String caseNumber = "INT2012-2031321";


        System.out.println(getTheYear("INT2042-321421"));
        System.out.println(getTheYear("int2313-421321"));
        float f6 = Float.parseFloat("3.14f");
        System.out.println(f6);
        System.out.println("Total price is: " + (3.14*3));
        System.out.println("The count is: 3");
        System.out.println("The price is 3.14 each");
        /*
         * Integer.parseInt("numberHere")
         *    it return an int value converted from String
         *
         * Integer.valueOf("numberHere")
         *  it return an Integer Object by wrapping up the number
         *
         * YOU MAY USE WHICHEVER YOU WANT BECAUSE :
         * Auto-boxing and Auto-unboxing will take care of the conversion anyway
         * */
    }

    public static int getTheYear(String caseNumber) {


//        String strYear = caseNumber.substring(3, 7);
//        int year = Integer.parseInt(strYear);
//        System.out.println("year = " + year);
        return Integer.parseInt(caseNumber.substring(3,7));
    }


}