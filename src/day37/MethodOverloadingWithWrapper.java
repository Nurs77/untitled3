package day37;

public class MethodOverloadingWithWrapper {
    public static void main(String[] args) {

        printNum(100);
        printNum(Integer.valueOf(100));
    }




    public static void  printNum(Integer x){
        System.out.println("Printing Integer x = "+x);

    }
    public static void printNum(int x ){
        System.out.println("Printing primitive Object x = "+x);
 }
}
