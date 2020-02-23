package day48;

public abstract class Employee {
    String name;
    int id;
    public Employee(){

    }
    public Employee(String name, int id){
        this.id = id;
        this.name = name;

    }
    public abstract void calculateAnnualSalary();
    public abstract String toString();

}
