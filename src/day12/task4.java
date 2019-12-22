package day12;

public class task4 {
    public static void main(String[] args) {
        /*String enterU = "user123";
        String enterP = "pass123";

        String userName = "user123";
        String password = "pass123";

        if(enterU == userName && enterP==password){
            System.out.println("SUCCESSFUL");

        } else if(enterU!=userName){
            System.out.println("INCORRECT");
        } else if(enterP!=password){
            System.out.println("INCORRECT");
        }

         */

        String username = "user123", password = "pass123";

        if(username.equals("user123")&&password.equals("pass123")){
            System.out.println("LOGIN SUCCESSFUL");
        }else if(!username.equals("user123") && password.equals("pass123")){
            System.out.println("USERNAME NOT CORRECT");
        }else if(username.equals("user123") && !password.equals("pass123")){
            System.out.println("PASSWORD INCORRECT");
        }else{
            System.out.println("BOTH WRONG");

        }
    }
}
