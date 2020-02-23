package day33;

public class PRactice {
    public static void main(String[] args) {
        int number = 1;
        System.out.println("Today is: ");
        System.out.println(numberToDay(number));

        //TODO 2, OPTIONALLY , Create an int Array that has 5 numbers, test your code with those
        int[] allCodes = {1, 3, 11, 4, 33};

        for (int x = 0; x < allCodes.length; x++) {

            String day = numberToDay(allCodes[x]);
            System.out.println("day = " + day);

        }
        System.out.println("-------------");
        for (int eachCode : allCodes) {

            System.out.println("each day = " + numberToDay(eachCode));

        }
    }
    public static String numberToDay(int number){
        switch (number) {
            case 1:
                return "Monday";
//                dayName = "Monday";
//                break ;
            case 2:
                return "Tuesday";
//                dayName = "Tuesday";
//                break ;
            case 3:
                return "Wednesday";
//                dayName = "Wednesday";
//                break ;
            case 4:
                return "Thursday";
//                dayName = "Thursday";
//                break ;
            case 5:
                return "Friday";
//                dayName = "Friday";
//                break ;
            case 6:
                return "Saturday";
//                dayName = "Saturday";
//                break ;
            case 7:
                return "Sunday";
//                dayName = "Sunday";
//                break ;
            default:
                return "FUNDAY!!";
//                dayName = "FUNDAY!!";
        }

//        return dayName;
    }
}
