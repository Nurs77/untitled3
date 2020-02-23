package day42;

public class Computer_Action {
    public static void main(String[] args) {
        Computer c1 = new Computer();
        c1.setBrand("Apple");
        c1.setRam(32);
        c1.setPrice(400);
        c1.runProgram();
        c1.calculate();
        System.out.println("c1 = " + c1);
        c1.setPrice(10);
        c1.setRam(10000);
        c1.runProgram();
        c1.calculate();
        System.out.println("c1 after change = " + c1);

        int myRam = c1.getRam();
        System.out.println("myRam is = " + myRam);

        Computer c2 = new Computer();
        c2.setBrand("HP");
        c2.setPrice(c1.getPrice()/2);
        c2.setRam(myRam/4);
        System.out.println("c2 = " + c2);


    }
}
