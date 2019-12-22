package officeHours;

import java.util.Arrays;

public class practice_12_10 {
    public static void main(String[] args) {
        String[] cars = {"bmw","wv","audi"};
                          //0    1     2
        System.out.println(cars[0]);
        System.out.println(cars[1]);
        System.out.println(cars[2]);

        // for each loop
        //temporary variable : array name

        for(int carsIndex = 0; carsIndex<=2 ; carsIndex++){
            System.out.println("Here is your car "+ cars[carsIndex ]);
        }

        for(String model : cars ){

            System.out.println("model = " + model);
            System.out.println("I am done assigning this car "+ model);
        }
    //                0   1 2 3  4
        int[] ages = {23,43,5,7,87};
        System.out.println("======================");
        System.out.println(ages[2]);
        System.out.println(ages[3]-ages[2]); //2

        //                      (7   -   5)
        //                          2
        System.out.println(ages[0]);
        System.out.println(ages[1]);
        System.out.println(ages[2]);
        System.out.println(ages[3]);
        System.out.println(ages[4]);

        for(int agesOfStudents : ages ){
            System.out.println("this student's age is " + agesOfStudents);



        }
        System.out.println(Arrays.toString(ages));
        System.out.println("I am done");
    }
}
