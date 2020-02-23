package day40;

public class HotMarketAction2 {
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
        //add 2k to Google
        o2.salary=o2.salary+2000;
        o2.salary+=2000;
        System.out.println("new Google salary: "+o2.salary);
        o3.salary = o1.salary+o2.salary;
        o3.displayInformation();
        o3.turnToFullTime();
        o3.turnToFullTime();
        o3.changeLocation("DC");
        o3.displayInformation();

    }



}
