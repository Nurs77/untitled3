package day56;

public class Test {
    public static void main(String[] args) {
        TestSuper t1 = TestSuper.getInstance();
        TestSuper t2 = TestSuper.getInstance();
        TestSuper t3 = TestSuper.getInstance();
        TestSuper t4 = TestSuper.getInstance();


        System.out.println("(t1==t2) = " + (t1 == t2));
        System.out.println("(t2==t3) = " + (t2 == t3));
        System.out.println("(t3==t4) = " + (t3 == t4));
        System.out.println("(t4==t1) = " + (t4 == t1));

    }
}
