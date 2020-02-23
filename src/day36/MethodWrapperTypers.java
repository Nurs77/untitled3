package day36;

public class MethodWrapperTypers {
    public static void main(String[] args) {

        Integer i1 = 12;
        Integer i2 = 20;
        sumAndPrint(i1,i2);
        System.out.println("============");
printTheDoubleValue(10);

    }


    public static void sumAndPrint(Integer num1, Integer num2){
        System.out.println(num1+num2);

    }
    public static void printTheDoubleValue(int x){
        System.out.println("After doubling "+ (x*2));
    }
}
