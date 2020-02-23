package officeHours.practice_01_23;

public class Pracice1 {

    String name;
    static int staticAge=10;
    int nonStatic;

    public static void main(String[] args) {
        Pracice1 Gunel = new Pracice1();
        Gunel.name = "Gunel";
        System.out.println(Gunel.name);
        Pracice1 Yana = new Pracice1();
        System.out.println(Yana.name);
        Pracice1 obj1=new Pracice1();


        obj1.staticAge =20;
        obj1.nonStatic =300;
        System.out.println("obj1.staticAge = " + obj1.staticAge);
        System.out.println("obj1.nonStatic = " + obj1.nonStatic);



        
    }
    public void method1(){
        System.out.println(name);
    }
}
