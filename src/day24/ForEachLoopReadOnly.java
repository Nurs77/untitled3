package day24;

public class ForEachLoopReadOnly {
    public static void main(String[] args) {
        int yourFavNumber = 300;
        int myFavNumber = yourFavNumber;
        myFavNumber=299;
        System.out.println(yourFavNumber);

        long[] nums = {10,40,20};
        for (int i = 0; i < 3; i++) {
            //how do I change double my frst item in the array
            long eachItem = nums[i];
            eachItem =100;

         //   nums[i]=nums[i]*2; here we are doubling the value of each item
        }
        for(long eachItem  : nums  ){
            eachItem = 100;

        }

        System.out.println("after we modify the value");
        //how do I know array items are modified or not?
        for (int i = 0; i < 3; i++) {
            System.out.println(nums[i]);

        }
    }
}
