package day13;

public class WarmUpAmazonShippingCalculator {
    public static void main(String[] args) {
        /*
        Amazon has 2 type of users: one is Prime member and another is regular member
        prime member get free shipping in all purchase no matter the amount
        regular member user get free shipping only if their purchase is more than 25$
        otherwise they get 5$ shipping fee

          */
        String memberType = "Regular";
        float amount = 15.99f;
        int shippingFee = 0;
        if(memberType.equalsIgnoreCase("Prime")){
            System.out.println("Free same day shipping");
            System.out.println("Thank your for the purchase of: " + amount);
        }else if(memberType.equalsIgnoreCase("Regular") && amount>25){
            System.out.println("Free Shipping for regular member");
            System.out.println("Thank your for the purchase of: " + amount);
        }else if(memberType.equalsIgnoreCase("Regular") && amount<25){
            System.out.println("Sorry 5$ shipping fee");
            shippingFee= 5;
            amount = amount + shippingFee;
            System.out.println("Thank your for the purchase of: " + amount);
        }else{
            System.out.println("get the fuck out of here");
        }
    }
}
