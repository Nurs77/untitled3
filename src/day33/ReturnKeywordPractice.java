package day33;

public class ReturnKeywordPractice {
    public static void main(String[] args) {
        int num = 1995;
        int[] numbers = new int[]{1999, 122, 2019, 1987, 1978, 1964, 3999, 2004};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("The age is ");

            System.out.println(year(numbers[i]));

        }
        System.out.println();


    }

    public static int year(int num) {

        if (num >= 1900 && num <= 2020) {
            System.out.print(2019 - num + " ");
        } else {
            System.out.println("0 " + num);
        }

        return num;
    }
}