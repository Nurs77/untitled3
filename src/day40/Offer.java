package day40;

public class Offer {
    String location;
    String company;
    long salary;
    boolean isFullTime;

    /**
     * This is an instance method to print all the information about Offer object
     */

    public void displayInformation() {
        System.out.println("Location = " + location + " | " + "Company = " + company + " | "
                + "Salary = $" + salary + " | " + "isFullTime = " + isFullTime);

    }

    public void turnToFullTime() {
        if (isFullTime == false) {


            isFullTime = true;
        } else {
            System.out.println("ALREADY FULLTIME");
        }

    }

    public void changeLocation(String newLocation) {
        location = newLocation;

    }

    public void changeAllInfo(String newCompany, String newLocation, long newSalary, boolean newFullTime){
        company =newCompany;
        location = newLocation;
        salary = newSalary;
        isFullTime=newFullTime;
displayInformation();
    }
    public boolean is100kOffer(){
return salary>=100000;
}
    public String toString(){
        return  "[Location = " + location + " | " + "Company = " + company + " | "
                + "Salary = $" + salary + " | " + "isFullTime = " + isFullTime+"]";
    }

}