package day34;



public class LoginMethod {
    public static void main(String[] args) {
        System.out.println(login("user", "abc123"));
        System.out.println("First try with boolean " + login1("user","abc"));
        System.out.println("Second try " + login1("user","abc123"));
    }

    public static String login(String username, String password) {
        if (username.equals("user") && password.equals("abc123")) {
            System.out.println("succesfull login");
        } else {
            System.out.println("FAIL");
        }
return "";
    }
    //Option 2
    public static Boolean login1(String username, String password){
       return(username.equals("user")&&password.equals("abc123"));
    }

}



