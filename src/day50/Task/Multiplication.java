package day50.Task;

public class Multiplication extends Question {
    public Multiplication(int num1, int num2){
        super("multiplication", "*");
        this.num1=num1;
        this.num2=num2;

    }
    @Override
    public void calculate() {
        answer = num1 * num2;
        calculated=true;

    }
    public String toString() {
        if(calculated==true){
            return num1+operator+num2+ " = "+ answer;
        }else{
            return num1+operator+num2+" = ";

        }
    }
}
