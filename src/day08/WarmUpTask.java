package day08;

import java.util.Scanner;

public class WarmUpTask {
    public static void main(String[] args) {
/*

* Voting Eligibility Program

* Create a variable called age as int

check whether this age is more than 18
if yes print: you are ready to vote!!!
if it's less 18 print wait until you are 18


 */
        Scanner vote = new Scanner(System.in);
        System.out.println("What is your age? : ");

        int age = vote.nextInt();
        if (age >= 18){
            System.out.println("Thank you for Voting kot Ebannyi");
        } else  {
            System.out.println("We are sorry! You are ineligible to vote, because you are not 18 or over. Come back next time");

        }

        System.out.println();
    }
}
