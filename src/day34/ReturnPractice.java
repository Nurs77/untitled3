package day34;

public class ReturnPractice {
    public static void main(String[] args) {
        // what is return keyword is used?
        //
        // break VS return
        //break ---> loop: break out of the loop
                // ---> switch : break out of the case
                // ---> can we us it to exit method? NOOO!!!!!
        // return -->  Inside a method
                // return the value out of a method with return typpe
                // the moment the return keyword is reached it wll terminate the method
                // can it be used in void method??
                    // Yes BUT ONLY IN THIS WAY : return;
                // what is the benefit of using in void method
                    //to terminate the method early
        printMin4CharacterLenghtName("Jon");
        printMin4CharacterLenghtName("java kotok");

    }
    public static void printMin4CharacterLenghtName(String name){
        if(name.length()<4){
            System.out.println("Invalid Name!");
return;
        }
        System.out.println(name);
    }
}
