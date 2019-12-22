package day14;

public class TrimAndIsEmpty {
    public static void main(String[] args) {
        String message = "   Repl IS COMING  !    ";

        System.out.println(message);
        System.out.println("message character count is " + message.length());

        message = message.trim();
        System.out.println(message);
        System.out.println("message character count is " + message.length());


        System.out.println(message.isEmpty());


    }
}