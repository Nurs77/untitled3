package day31;

public class DailyRoutine {
    public static void wakeUp(){
        System.out.println("Open your eyes");
        System.out.println("Close your eye");
        System.out.println("Hear your alarm?");
        System.out.println("=========");

    }
    public static void drinkCoffee(){
        System.out.println("Put coffee in your coffee");
        System.out.println("Press the button make your coffee");
        System.out.println("==========");
    }
    public static void studyJava(){
        System.out.println("Thnk about Java waking up");
        System.out.println("Think about java drinking coffee");
        System.out.println("JAVA JAVA");
        System.out.println("=========");
    }
    public static void sayJavaLove300(){
        for (int i = 1; i <=300 ; i++) {
            System.out.print("I LOVE JAVA | ");

        }
    }
    public static void main(String[] args) {
        wakeUp();
        drinkCoffee();
        studyJava();
        sayJavaLove300();

    }
}
