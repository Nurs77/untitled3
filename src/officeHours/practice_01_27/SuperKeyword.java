package officeHours.practice_01_27;
class TestData{
    public TestData(){
        System.out.println("A");
    }
    int a = 100;
    public void method1(){
        System.out.println("super class methods");
    }
}
public class SuperKeyword extends TestData{
    public SuperKeyword(){
        //super();
        System.out.println("B");
    }
    public void method1(){
        System.out.println("Method calss sub instance ");
    }
    public static void main(String[] args) {
       SuperKeyword obj = new SuperKeyword();


    }
    public void mm(){
        System.out.println(super.a);
        super.method1();
    }
}
