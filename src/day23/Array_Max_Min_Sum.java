package day23;

public class Array_Max_Min_Sum {
    public static void main(String[] args) {
        int num[] = {1, 34, 56, 23, 87, 18};
        for (int i = 5; i >= 0; i--) {
            System.out.print(num[i] + " ");
        }
        int lastItem = num[5], min = num[0], max = num[0], middle = num[0], sum = 0;
        System.out.println(lastItem);
        System.out.println("lastItem = " + lastItem);
        for (int i = 0; i < 6; i++) {
            if (max < num[i]) {
                max = num[i];
            }
            if (min > num[i]) {
                min = num[i];
            }
            sum += num[i];
        }
        System.out.println("MAX is" +max);
        System.out.println("MIn is " + min);
        System.out.println("sum is  "+ sum);
    }
}