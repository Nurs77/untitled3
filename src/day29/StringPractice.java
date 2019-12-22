package day29;

import java.util.Arrays;

public class StringPractice {
    public static void main(String[] args) {
        String hero1 = "Superman-Clark kent";


        String[] heroSplitted = hero1.split("-");
        System.out.println("hero spltted" + Arrays.toString(heroSplitted));
        System.out.println("Hero Code is " + heroSplitted[0]+ " and identity is "+ heroSplitted[1]);
String fullName = heroSplitted[1];
        //make initial CK
        String[] fullNameSplitted = fullName.split(" ");
        System.out.println("fullNameSplitted = " +Arrays.toString( fullNameSplitted));
        String lastName =  fullNameSplitted[fullNameSplitted.length-1];
        System.out.println("last name = "+lastName);
        System.out.println("Initial of the hero is: "+ fullName.charAt(0)+""+lastName.charAt(0));



    }



}
