package officeHours.practice_02_12;

public class ExceptionsPractice {

    public static void main(String[] args) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted Exception is handled");
        }
        System.out.println("Step 2");
        try {
            int[] arr = {1, 2, 3};
            System.out.println(arr[50]);

        } catch (
                ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index out of bondException is handled");
        } catch (
                IndexOutOfBoundsException e) {
            System.out.println("Index out off bondException is handled");
        } catch (
                ArithmeticException e) {
            System.out.println("Arithmetic exception is handled");
        } catch (
                IllegalStateException e) {
            System.out.println("Illegal StateException is handled");
        } catch (
                Exception e) {
            System.out.println("Exception is handled");
        }


        System.out.println("Runtime");

        System.out.println("Test Completed");

}
}
