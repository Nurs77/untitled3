package officeHours;

public class practice_01_14 {

        //  System.out.println(number); local field must be initialized
        String jobTitle;
        String name;
        double salary;
        int employee_ID;
        int age;



        public void standUp () {
            System.out.println("This team's stand up meeting is at 10;45");
        }

        public void hi () {
            String name = "Asiya";

        }
        public void hello (String name){
            System.out.println("Hello" + name);

        }
        public  void demo(){
            System.out.println(name+ " should attend Demo Meeting ");
        }

    @Override
    public String toString() {
        return "practice_01_14  " +
                "\njobTitle = " + jobTitle + '\n' +
                "name = " + name + '\n' +
                "salary = " + salary +
                "\nemployee_ID = " + employee_ID +
                "\nage = " + age;
    }
}
