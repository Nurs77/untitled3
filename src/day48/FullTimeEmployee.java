package day48;

public class FullTimeEmployee extends Employee {
    double monthlySalary;

    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;

    }

    @Override
    public void calculateAnnualSalary() {
        System.out.println("Annual salary is:  "+ (12*monthlySalary));

    }

    @Override
    public String toString() {
        return "FullTimeEmployee{" +
                "monthlySalary=" + monthlySalary +
                ", name='" + name + '\'' +
                ", id=" + id + ", annual salary = "+ (12*monthlySalary)+
                '}';
    }
}
