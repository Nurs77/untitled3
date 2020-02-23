package day34;

public class MethodOverloadingIntro {
    public static void main(String[] args) {
        System.out.println("Method overloading");
        System.out.println(12);


        String name = "Overloading";
        System.out.println(name.substring(6));
        System.out.println(name.substring(1,4));
        System.out.println(name.indexOf("di"));
        System.out.println(name.indexOf("o",2));

//Mehod overloading:
        //usng same name and different parameter for methods
        // to reuse the name for similar actions
        sayHello();
        sayHello("universe");
        sayHello("Denis");
        sayHello(100);

    }
    public static void  sayHello(){
        System.out.println("Hello, World");

    }
    public static void  sayHello(String name){
        System.out.println("Hello, " +name);


    }
    public static void sayHello(int num){
        System.out.println("Hello, " +num);
    }
}
