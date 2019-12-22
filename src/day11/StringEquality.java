package day11;

public class StringEquality {
    public static void main(String[] args) {
        /*char c1='b';
        char c2='B';
        char c3='b';
        System.out.println("is c1 eaual to c2?");
        System.out.println(c1==c2);

        System.out.println("is c1 equal to c2?");
        System.out.println(c1==c3);

        int num1 = 10;
        int num2 = 10;
        System.out.println("is num1 equal to num2?");
        System.out.println(num1==num2);

         */

        String name = "Rabia";

        String name2 = new String("Rabia");
        String name3= "Rabia";
        System.out.println(name);
        System.out.println(name2);

        System.out.println(name==name2);
        System.out.println(name==name3);

        System.out.println("USing different method");
        System.out.println(name.equals(name2));
        System.out.println(name.equals(name3));


    }
}
