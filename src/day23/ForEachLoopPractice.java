package day23;

public class ForEachLoopPractice {
    public static void main(String[] args) {

        /*
        *create a long array or 5 items called salaries
        * put your salary amounts that ok for your offer
        * 
        * use for each loop to iterate over them
        * 
        * OPTIONALLY : 
         */

        long[] salaries = {90000,105000,110000,120000,130000};
        for (long desiredsalary:
             salaries) {
            if (desiredsalary > 100000) {

            }

                System.out.println("desired salary = " + desiredsalary);
            }

        //Max Salary
        System.out.println("===========");
        //I need to pick up an item from this array so I can compare with other items
        //since first one is right \there,I just decidec to pick up
        //and make it temporarily the max value
        // can I pick 2nd or 3rd instead---->yess
        long maxSalary = salaries[0];
        for (long salary: salaries) {
            if(salary>maxSalary){
                maxSalary=salary;


        }

        }
        System.out.println("max salary is "+ maxSalary);
        
        
        long minSalary = salaries[0];
        for(long minsalarry :salaries){
            if(minsalarry<minSalary){
                minSalary=minsalarry;
            }
        }
        System.out.println("minSalary = " + minSalary);
        }

        }






