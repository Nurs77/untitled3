package day50.Task;

public abstract class Question {
    int num1;
    int num2;
    String operator;
    int answer;
    boolean calculated;
    String questionType = "Unknown";
    public abstract void calculate();

    public Question(String questionType, String operator) {
        this.operator = operator;
        this.questionType = questionType;
    }

    @Override
    public String toString() {
        return "Question{" +
                "questionType='" + questionType + '\'' +
                '}';
    }
}
