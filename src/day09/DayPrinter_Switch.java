package day09;

public class DayPrinter_Switch {
    public static void main(String[] args) {
        int dayCode = 7;

        switch (dayCode) {
            case 1:
                System.out.println("Day is Monday");
                break ;
            case 2 :
                System.out.println("Day is Tuesday");
                break ;
            case 3:
                System.out.println("Day is Wednesday");
                break;
            case 4:
                System.out.println("Day is Friday");
                break;
            default:
                System.out.println("Day is unknown");

        }
    }
}
