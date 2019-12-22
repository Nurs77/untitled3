package day14;

public class TASK {
    public static void main(String[] args) {
        String password = "abdasdas_$";
        //(password.length()>=8 && password.length()<16)
        // password.contains("_")|| password.contains("$")
        // !password.contains("");
        //password.startWith("ab");

        boolean min8max16 = password.length()>=8 && password.length()<16;
        boolean mustContain_or$ = password.contains("_")|| password.contains("$");
        boolean no_inPassword = !password.contains(" ");
        boolean mustStartAb = password.startsWith("ab");

        if(min8max16 && mustContain_or$ &&no_inPassword &&mustStartAb){
            System.out.println("ALL GOOD");

        }else {
            System.out.println("Invalid shit bro try again idiot ");
        }

    }
}
