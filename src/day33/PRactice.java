package day33;

public class PRactice {
    public static void main(String[] args) {
        int number = 6;
        System.out.println("Today is: ");
        System.out.println(numberToDay(number));
    }
    public static String numberToDay(int number){
        switch (number){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednsday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("FUNDAY");
                break;
        }
        return "";
    }
}
