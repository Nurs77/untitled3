package day55;

public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c1 = new Calculator();
        c1.addNum(100).addNum(200).addNum(300);

        c1.displayFinalResult();
        c1.minusNum(100);
        c1.displayFinalResult();
    }
}
