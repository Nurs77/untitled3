package day14;

public class TASK2 {
    public static void main(String[] args) {
        String email = "kotokpidaroza@mail.ru";

        if( !email.contains("@") || email.contains(" ")){
            System.out.println("Invalid Email");


        } else if( email.endsWith("gmail.com")){
            System.out.println(" Google Mail");
        }else if(email.endsWith("@yahoo.com")){
            System.out.println("Yahoo Mail");
        }else if(email.endsWith("mail.ru")){
            System.out.println("Russian Mail");
        }
    }
}
