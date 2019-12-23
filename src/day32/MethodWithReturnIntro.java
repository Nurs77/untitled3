package day32;

public class MethodWithReturnIntro {
    public static void main(String[] args) {
        String name = giveMeMyName();
        System.out.println("name = " + name);
        int Myresult = doubletheNumber(10);
        System.out.println("Myresult = " + Myresult);
        System.out.println("result of double 100 is "+ doubletheNumber(100));
    }
    public static String giveMeMyName(){
        //assume getting my name is multi-step complex operation

        return "Nursultan Nazarbayev";
    }
public static int doubletheNumber(int num){
    System.out.println("I am going to dobule the value of "+num);
    int result = num*2;
    return result;
}
}
