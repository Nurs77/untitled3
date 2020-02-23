package officeHours;

public class practice_01_14v2 {
    public static void main(String[] args) {
        practice_01_14 employee1= new practice_01_14();
        employee1.name = "Nursultan";
        employee1.jobTitle = "PO";
        employee1.employee_ID = 271;
        employee1.age = 24;
        employee1.salary=120000;
        employee1.standUp();

        practice_01_14 employee2= new practice_01_14();
        employee2.name = "Tolgonai";
        employee2.jobTitle = "Scrum Master";
        employee2.employee_ID = 999;
        employee2.standUp();


        practice_01_14 employee3= new practice_01_14();
        employee3.name = "Nursultan";
        employee3.jobTitle = "Tester";
        employee3.employee_ID = 111;
        employee3.standUp();

        System.out.println("=========");

        System.out.println("employee1's name is: "+employee1.name);
        System.out.println(employee1.toString());

    }
}
