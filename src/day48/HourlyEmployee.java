package day48;

public class HourlyEmployee extends Employee {
    double hourlyWage;
    int numbersOfHours;

    public HourlyEmployee(String name, int id, double hourlyWage, int numbersOfHours) {
        super(name, id );
        this.hourlyWage = hourlyWage;
        this.numbersOfHours = numbersOfHours;


    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Hoursly Employee yearly: "+ (hourlyWage*numbersOfHours));

    }

    @Override
    public String toString() {
        return "HourlyEmployee{" +
                "hourlyWage=" + hourlyWage +
                ", numbersOfHours=" + numbersOfHours +
                ", name='" + name + '\'' +
                ", id=" + id + ", yearly salary = "+(hourlyWage*numbersOfHours)+
                '}';
    }
}
