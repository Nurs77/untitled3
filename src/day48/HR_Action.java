package day48;

public class HR_Action {
    public static void main(String[] args) {
        HourlyEmployee e1 = new HourlyEmployee("Nursultan", 77, 60,2000);
        e1.calculateAnnualSalary();
        System.out.println("e1 = " + e1);
        FullTimeEmployee f1 = new FullTimeEmployee("Tolgonai", 88, 8000);
        f1.calculateAnnualSalary();
        System.out.println("f1 = " + f1);
        FullTimeEmployee f2 = new FullTimeEmployee("Ernest", 99, 12000);
        System.out.println("f2 = " + f2);
    }
}
