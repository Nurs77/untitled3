package day35;

public class WrapperClassIntro {
    public static void main(String[] args) {
        int x =10;


        Integer xObj1 = new Integer(12);

        Integer xObj2 = Integer.valueOf(10);
        Integer xObj3 = Integer.valueOf("15");

        byte bvalue = xObj3.byteValue();
        System.out.println("bvalue = " + bvalue);
        double dValue = xObj3.doubleValue();
        System.out.println("dValue = " + dValue);
;    }
}

