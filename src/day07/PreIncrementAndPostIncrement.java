package day07;

public class PreIncrementAndPostIncrement {
    public static void main(String[] args) {
        int kotok = 10;
        kotok++;

        System.out.println(kotok);
        // when ++ comes after the variable
        // it's called post increment
        // it will increase the value
        // but it will reflect the increased the value next time the variable show up!

        //System.out.println(++kotok);
        System.out.println(kotok++);
        System.out.println(kotok);

        int score =50;
        System.out.println(++score);
        System.out.println(score++);
        System.out.println(score);

        System.out.println(--score);
        System.out.println(score--);
        System.out.println(score);


    }
}
