package officeHours.practice_01_27;

import org.w3c.dom.ls.LSOutput;

public class practice_02_18_Exception {
    public static void main(String[] args) {
        int num = 19;
        short i =4;
test3();
        //2.Runtime Eception == unchecked
        //      JRE jvm libraries run your code

        //String word="java";
//        System.out.println(word.charAt(6));

        try{
            String word = "java";
            System.out.println(word.charAt(6));

        }catch (StringIndexOutOfBoundsException e ){
            System.out.println("StringIndexOutOfBoundsException is handled");
        }catch (Exception suka){
            System.out.println("Exception is handled ");
        }finally {
            System.out.println("THis runs no matter what on the above");
        }
        System.out.println("================= THROWS KEYWORD ==================");
        // throws is used only for the method

        // throw is used with new key word, throw new exception


    }
    public static void test1() throws Exception{
        String name="Cybertek";
        System.out.println(name.charAt(10));

    }
    public static void hi() throws Exception{
        System.out.println("hi hi");
        test1();
    }

    public static void test2(){

        throw new ArithmeticException(); // I am not handling, I am throwing Exception

    }

    public static void test3(){

        test2();
    }

}
