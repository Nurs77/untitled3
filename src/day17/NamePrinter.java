package day17;

public class NamePrinter {
    public static void main(String[] args) {
        String name = "Call Alexander";
        /*     System.out.println(  name.charAt(0) );

        System.out.println(  name.charAt(0) );
        System.out.println(  name.charAt(2) );
        System.out.println(  name.charAt(3) );
        System.out.println(  name.charAt(4) );
        System.out.println(  name.charAt(5) );
        System.out.println(  name.charAt(6) );
        System.out.println(  name.charAt(7) );
        System.out.println(  name.charAt(8) );
        */

        int x=0;
       /* System.out.println(  name.charAt(x));
        ++x;

        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;
        System.out.println(name.charAt(x));
        ++x;


        */

       while(x<name.length()){
           System.out.print("index " +x+" : ");
           System.out.println(name.charAt(x));
           ++x;

       }
    }
}
