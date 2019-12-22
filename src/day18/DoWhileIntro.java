package day18;

public class DoWhileIntro {
    public static void main(String[] args) {

        //{} curly braces
        //[] square bracket
        //() parenthesis
        // ; semi colon
        // : colon
        // % remainder operator
        // ! exclamation mark
        // | pipe
        // & Ampersand
        // / forward slash
        // \  backslash


        int x = 1;
        do {
            System.out.println(x);
            ++x;

        } while (x <= 5);
        System.out.println("------------------");
        int y = 5;
        do {
            System.out.println(y);
            --y;
        } while (y > 0);

        /*
        WHILE LOOP check the condition first then enter the staement
        DO WHILE LOOP will take the action at least once then check the condition

        DO WHILE LOOP always run at least one iteration
        WHILE loop might not even run
         */



    }
}
