package day58_Exceptions_RunTimeError;



/*

there is two ways to avoid the error
1) Handle by using try catch
2) declare     Ex: main () . throws and put the error name here



 */
public class CheckedExceptionDemo {
    public static void main(String[] args) throws InterruptedException { // the way to declare the ERROR
        System.out.println("Checked Exception in next line");
        try {            //Handling the ERROR by using try catch
            Thread.sleep(1000);
        }catch(InterruptedException e){
            System.out.println("Interrupted Exception is handled");
        }
        System.out.println("After Thread.sleep");

    }
}
