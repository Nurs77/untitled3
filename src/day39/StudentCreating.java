package day39;

public class StudentCreating {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Karima";
        s1.age = 18;
        s1.gender = 'F';
        int oldAge = s1.age;
        System.out.println("s1.name = " + s1.name);
        System.out.println(s1.name + " | "+s1.age +" | "+ s1.gender);
        s1.age = 28;
        System.out.println("difference in age " + (oldAge  - s1.age));

    }
}
