package day09;

public class CitizenTypeChcker {
    public static void main(String[] args) {
        String citizenType ;
         int age = 30;
         if( age > 65) {
             citizenType = "Senior";
         } else if ( age <40){
            citizenType = "Fuck out of here";

         } else {
             citizenType = " not senior";
         }
        System.out.println("The citizen age is " + age + " and he is " + citizenType );
    }
}
