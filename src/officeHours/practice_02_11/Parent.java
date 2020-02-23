package officeHours.practice_02_11;

public class Parent {
    String name;
    int age;
    int ssn;

    public Parent(){
        name="This parent name is nobody";
        age = 0;
        ssn = 0 ;

    }

    public Parent(String name, int age, int ssn) {
        this.name = name;
        this.age = age;
        this.ssn = ssn;
    }

    public void cookFood(String foodName){
        System.out.println("Cooking "+ foodName);
    }

    public static void hi(){
        System.out.println("Hi how are you?");
        System.out.println(1234);
        System.out.println(false);
    }

    public static void main(String[] args) {

    }

}
