package day36;

public class MethodWithParameter {
    public static void main(String[] args) {

     int num = 7;

     addOneHundred(num);
     addOneHundred1(num);


    }
    public static void addOneHundred(int x){

        System.out.println(x+100);
    }

    public static void addOneHundred1(int x){
        x = x+100;
        System.out.println(x);
    }
}
