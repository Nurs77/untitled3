package day40;

import java.util.ArrayList;
import java.util.Arrays;

public class HotMarketActions {
    public static void main(String[] args) {
        Offer o1 = new Offer();
        o1.company = "Apple";
        o1.location = "Austin";
        o1.isFullTime = true;
        o1.salary = 140000;
        o1.displayInformation();

        Offer o2 = new Offer();
        o2.location = "Boston";
        o2.company =  "Google";
        o2.salary = 100000;
        o2.isFullTime = true;
        o2.displayInformation();

        Offer o3 = new Offer();
        // if we don't assign values we get default values


        o3.displayInformation();
        System.out.println("========== FOr Each Loop ========");

        ArrayList<Offer> myOffers = new ArrayList<>();
        myOffers.add(o1);
        myOffers.add(o2);
        myOffers.add(o3);
        for(Offer each: myOffers){
            each.displayInformation();
        }

        System.out.println("=========== For Loop ===========");
        for (int i = 0; i <myOffers.size() ; i++) {
            Offer each = myOffers.get(i);
            each.displayInformation();

        }

    }
}
