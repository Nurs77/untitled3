package day44;

public class CourseAction {
    public static void main(String[] args) {

        System.out.println("Course.counter = " + Course.counter);

        Course c1 = new Course("Java","foundation");
        Course c2 = new Course("Selenium","Automation");
        Course c3 = new Course("Sql","Database");
        Course c4 = new Course("API","Webservices");
        Course c5 = new Course("Agile","Soft skills");

        System.out.println("Course.counter = " + Course.counter);



    }
}
