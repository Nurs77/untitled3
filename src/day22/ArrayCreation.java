package day22;

public class ArrayCreation {
    public static void main(String[] args) {
        int[] ages = new int[]{3,5,11,33,57,18};

        int itemCount = ages.length;

        System.out.println("itemCount = " + itemCount);
        System.out.println("ages = " +ages);
        for (int x = 0; x < itemCount ; x++) {
            System.out.println(ages[x]);


        }

        int[] areaCodes = {703,300,954,665};
        for (int x = 0; x < areaCodes.length; x++) {
            System.out.print(areaCodes[x] + " ");

        }
    }
}
