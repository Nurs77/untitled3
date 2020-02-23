package day41;

public class Person_Action {
    public static void main(String[] args) {
        PrivateIntroPerson p1 = new PrivateIntroPerson();

p1.setAll("Hasan",34,123456789);
        System.out.println("p1 = " + p1);
        System.out.println("p1.getName() = "+p1.getName());
        p1.setName("Nursultan");
        System.out.println("new name = "+p1.getName());

        p1.setAge(21);
        p1.setSsn(987654321);

        System.out.println("new age = " +p1.getAge());
        System.out.println("new ssn = " + p1.getSsn());
        System.out.println(p1.toString());

    }
}
