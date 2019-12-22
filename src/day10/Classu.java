package day10;

public class Classu {
    public static void main(String[] args) {

        String order = "";
        int itemCode = 10;
        switch (itemCode) {
            case 1:
                order = "Burger";
                break;

            case 2:
                order = "French Fry";
                break;
            case 3:

                order = "NUggets";
                break;
            case 4:

                order = "PIZDA";
                break;

            default:
                System.out.println("uknown shit bro");
                order = "kotok";
        }

        System.out.println("Your order is " + order + " Thank you for coming, see you later");


    }
}
