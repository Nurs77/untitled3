package day37;

import java.io.UTFDataFormatException;
import java.util.ArrayList;
import java.util.List;

public class  TeamMateListPractice {
    public static void main(String[] args) {


        /**
         * Warm up:
         * Create Arraylist of String and store
         * teamMates
         * print one by one
         * print reverse
         * print first last
         * print 2 at a time
         * concat everyone in one string separated by -
         */


            //ArrayList<String> teamMates = new ArrayList<>();
            List<String> teamMates = new ArrayList<>();

            teamMates.add("Akbar");
            teamMates.add("Kuzzat");
            teamMates.add("Murodil");
            teamMates.add("Maruf");
            teamMates.add("Vasyl");
            teamMates.add("Muhtar");
            teamMates.add("Asiya");
            teamMates.add("Mike");
            teamMates.add("Guljannat");
            teamMates.add("Nursultan");

            System.out.println("teamMates = " + teamMates);

            // first item
            System.out.println("First Item = " + teamMates.get(0));
            //  last item--> using last index -->> size()-1
            int lastItemIndex = teamMates.size() - 1;
            System.out.println("lastItemIndex = " + lastItemIndex);
            System.out.println("Last Item = " + teamMates.get(lastItemIndex));

            // print one by one
            System.out.println("\nALL ITEMS : ");
            for (int x = 0; x < teamMates.size(); x++) {

                System.out.println("\tItem " + (x + 1) + " = " + teamMates.get(x));

            }
            System.out.println("\nALL ITEMS in reverse order: ");
            for (int x = lastItemIndex; x >= 0; x--) {

                System.out.println("\tItem " + (x + 1) + " = " + teamMates.get(x));

            }
            // print 2 items at a time
        System.out.println("\nPrint two items at a time");

        for (int x = 0; x <= teamMates.size()-2 ; x++) {
            System.out.println("\t"+ teamMates.get(x)+" "+ teamMates.get(x+1));

        }
        System.out.println("\n Printing without repeating");
        for (int x = 0; x <=teamMates.size()-2 ; x+=2) {
            System.out.println("\t" +teamMates.get(x)+" "+teamMates.get(x+1));

        }
        System.out.println("\n Print out by 3");
        for (int x = 0; x <=teamMates.size()-3 ; x+=3) {
            System.out.println("\t"+ teamMates.get(x)+ " - " + teamMates.get(x+1)+" - "+ teamMates.get(x+3));

        
        }
        String result = "";
        for (int i = 0; i < teamMates.size(); i++) {
            result = result + teamMates.get(i)+ " - ";

            
        }

        System.out.println("result = " + result.substring(0,result.length()-2));

        String listToString = teamMates.toString();
        System.out.println("before replacing = \n"+listToString);
        System.out.println("after replacing = \n" + listToString.replace(", ", " - ")
                .replace("[","")
                .replace("]",""));

        }
    }


