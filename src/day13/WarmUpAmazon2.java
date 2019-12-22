package day13;

public class WarmUpAmazon2 {
    public static void main(String[] args) {
        boolean youWantToShop = true ;
        String preference = "Store";

        if(youWantToShop == true){

            if(preference.equals("Store")){
                System.out.println("GOING TO STORE FOR SHOPPING");
            }else {
                System.out.println("GOing to online for shopping");
            }
        }else{
            System.out.println("good job stay home coding!!!");
        }

    }
}
