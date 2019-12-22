package day09;

import java.util.Scanner;
public class task2 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please Enter a Number Between 1-7");
        String language="";
        int languageCode=scan.nextInt();
        if (languageCode==1) {
            language="Hello";
        } else if (languageCode==2) {
            language="Salam";
        }else if (languageCode==3) {
            language="Hola";
        }else if (languageCode==4) {
            language="Privet";
        } else if (languageCode==5){
            language="Merhaba";
        }else if (languageCode==6) {
            language="Szia";
        }else if (languageCode==7) {
            language="Bonjour";
        }else{
            language="Unknown";
        }
        System.out.println(language + ", SDET");
    }
}
