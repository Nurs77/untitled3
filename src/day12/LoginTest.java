package day12;

public class LoginTest {
    public static void main(String[] args) {
        /*String userName ="abc123";
        boolean userNameCorrect = userName.equals("ABC123");

        System.out.println(userNameCorrect);
        boolean userNameCorrect2 =userName.equalsIgnoreCase("ABC123");
        System.out.println(userNameCorrect2);

         */

        /*String myName = "Nursultan";
        boolean errorName = myName.equals("nursultan");
        System.out.println(errorName);
        boolean errorName2 = myName.equalsIgnoreCase("nursultan");
        System.out.println(errorName2);


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
