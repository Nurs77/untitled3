package day09;

public class DayPrinter_Version2 {
    public static void main(String[] args) {
        int dayCode = 2;

        String dayName = "";




        if (dayCode == 1){
            dayName = "Monday" ;
        }else if (dayCode == 2){
            dayName = "Tuesday";
        }else if (dayCode == 3){
            dayName = "Wednsday";
        }else if (dayCode == 4){
            dayName = "Thursday";

        }else if (dayCode == 5){
            dayName = "Friday";
        }else if (dayCode == 6){
            dayName = "Saturday";
        }else if (dayCode == 7){
            dayName = "Sunday";
        } else {
            dayName = "POHUI";
        }

        System.out.println("Day is " + dayName);
    }
}
