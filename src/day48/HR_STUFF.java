package day48;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HR_STUFF {
    public static void main(String[] args) {


        Employee e1 = new HourlyEmployee("Nurs", 77, 60, 2000);
        //e1.calculateAnnualSalary();
        e1 = new FullTimeEmployee("Kotok", 88, 12000);
      //  e1.calculateAnnualSalary();
       // System.out.println("e1 = " + e1);
Employee e2 = new HourlyEmployee("Aibek", 99, 70, 1500);
Employee e3 = new FullTimeEmployee("Dalbich", 100, 7500);


        List<Employee> allEmployee =  Arrays.asList(e1,e2,e3);

        for(Employee each: allEmployee){
           // System.out.println("each = "+ each);
            System.out.println("Name is "+ each.name );
            each.calculateAnnualSalary();

        }

    }
}
