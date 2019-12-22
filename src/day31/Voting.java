package day31;

public class Voting {
    public static void  checEligibility(int age){
        if(age>18){
            System.out.println("You are eligible to vote");

        }else{
            System.out.println("you are not");
        }

    }
    public static void main(String[] args) {
        checEligibility(15);
        checEligibility(23);
        checEligibility(63);
        int yourAge = 12;
        checEligibility(yourAge);
    }
}
