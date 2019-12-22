package day27;

import java.util.Arrays;

public class MultiDimens3D {
    public static void main(String[] args) {
        //2D Array
        int[][] arr2D = {{1,2,3},{4,5,6}};

        //3D Array             0         1          0            1
        int[][][] arr3D = { { {1,2,3},{4,5,6}} , { {7,8,9} , {10,11,12} } };
                              //      0                      2

        //print 9
        System.out.println(arr3D[1][0][2]);

        //print 2
        System.out.println(arr3D[0][0][1]);

        //print {1,2,3}
        System.out.println(Arrays.toString(arr3D[0][0]));

//print {10,11,12}
        System.out.println(Arrays.toString( arr3D[1][1]));
//print everything in array
        System.out.println(Arrays.deepToString(arr3D));



// printing everything without array


        for (int i = 0; i < arr3D.length; i++) { // each index of 2D array
            for (int j = 0; j < arr3D[i].length; j++) { // each index number of 1D array
                for (int k = 0; k < arr3D[i][j].length; k++) { // each index number of the values
                    System.out.print(arr3D[i][j][k] + " "); // returns values

                }
            }

        }
// Assignment: convert the nested loops above to the nested for each loop

    }
}
