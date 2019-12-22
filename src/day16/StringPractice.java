package day16;

import java.util.Scanner;

public class StringPractice {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        String keywordtoSearch = scan.nextLine();
        String tabTitle = keywordtoSearch + "-Google Search";

        if(tabTitle.startsWith(keywordtoSearch)&&tabTitle.endsWith("-Google Search")){
            System.out.println("Test Passed");
        }else{
            System.out.println("Test Failed");
        }
    }
}
