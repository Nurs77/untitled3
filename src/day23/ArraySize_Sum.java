package day23;

public class ArraySize_Sum {
    public static void main(String[] args) {
        int[] num = new int[]{11,12,3,51,32,15,62};
        for(int xx = num.length-1;xx>=0;xx--) {
            System.out.println("item = " + num[xx]);
        }
        int arraySize = num.length;
        int lastItemIndex = arraySize-1;
        
int lastItemValue=num[lastItemIndex];
        System.out.println("lastItemValue = " + lastItemValue);
        System.out.println(num[num.length/2]);
        int sum = 0;
        for (int x = 0; x < arraySize; x++) {
            int currentItem = num[x];
            sum=sum+currentItem;
            
            
        }
        System.out.println("sum = " + sum);
    }
}
