package day19;

public class CharandForLoop {
    public static void main(String[] args) {
        //each character has it's corresponding ascii value
        //frm ascii table

        char myChar = 'A'; // e


        System.out.println(myChar);
        //'A' + 1 --->> 65 + 1 = 66 ---> 'B' (myChar data type is char)
        System.out.println(  ++myChar   );
        System.out.println(  ++myChar   );
        System.out.println(  ++myChar   );
        System.out.println("------------------------");


        System.out.println('A' > 'B');
        System.out.println('Z' > 'B');


        System.out.println("-------------------------");
        for(  char iChar = 'A'; iChar<='Z'; iChar++ ){
            System.out.print(iChar +" ");

        }
        System.out.println();
        for(  char iCar = 'Z'; iCar>='A'; iCar-- ) {
            System.out.print(iCar + " ");

        }
    }
}
