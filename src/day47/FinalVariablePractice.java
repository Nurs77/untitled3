package day47;

import static java.lang.Math.PI;

public class FinalVariablePractice {
    public static void main(String[] args){
        int x =10; //declaring and initializing a variable
        x = 100;
        //declaring and initializing a final variable
        //declaring and assigning initial value to a final variable
        final int a =20;
        //re-assigning new value to the final variable --ERROR!!!!

        // a=20; ERROR ENEN SGEIN


       final Student s1 = new Student(101);
       //s1=new Student(102);
        System.out.println(s1.studentID);
        //s1.studentID =200;
        System.out.println(s1.studentID);
        System.out.println(Student.SCHOOL);

        //CAN NOT REASSING BECAUSE ITS FINAL
        //Student.school = "abc";

        System.out.println(Byte.MAX_VALUE);

//PI in Java
        System.out.println(Math.PI);

printDoubleNumber(12);
final String name = "Zehra";
        System.out.println(name);


    }
    public static void printDoubleNumber(final int x){

        // x=x*2;
        //System.out.println("x*2= " +x);

        System.out.println("x*2= "+ x*2);
    }
}
