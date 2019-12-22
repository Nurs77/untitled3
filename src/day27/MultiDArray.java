package day27;

public class MultiDArray {
    public static void main(String[] args) {
        int[][] numbers = {{12,11,10,9},{19,20,15},{23,531,42,32}};
        int max = numbers[0][0];
        for (int i = 0; i < numbers.length ; i++) {//checks each single dimensional array
            for (int j = 0; j <  numbers[i].length; j++) { // check each element in the single dimension
                if(max<numbers[i][j]){
                    max=numbers[i][j];
                }

            }

        }
        System.out.println(max);
        // solution 2
        int max2 = numbers[0][0];
        for(int[] each1DArray:numbers){
            for(int eachInt:each1DArray){
                if(max2<eachInt){
                    max2=eachInt;
                }
            }
        }
        System.out.println("Maximum number: "+ max2);
        System.out.println("=============");


        // ===== FINDING THE MINIMUM ORDER ======
        int min = numbers[0][0];
        for (int i = 0; i < numbers.length ; i++) {
            for (int j = 0; j < numbers[i].length ; j++) {
                if(min>numbers[i][j]){
                    min=numbers[i][j];

                }

            }
        }
        System.out.println("Minimum NUmber: "+ min);

        System.out.println("==============");



    }
}