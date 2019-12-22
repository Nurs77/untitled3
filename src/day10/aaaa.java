package day10;

public class aaaa {
    public static void main(String[] args) {
        System.out.println("Welcome to the McDonalds, What can I get you?");
        String order = "";
        int itemCode = 7;
        if(itemCode ==1){
            order = "Burger";
        } else if (itemCode==2){
            order = "French Fry";

        }else if (itemCode == 3) {
            order = "NUggets";

        }else if (itemCode==4){
            order = "PIZDA";
        }else {
            order = "Unkwnown";

        }
        System.out.println("Your order is " + order + " Thank you for coming, see you later");
    }
}
