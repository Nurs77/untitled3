package day27;

public class MultiDimensionalArray {
    public static void main(String[] args) {

        String[] developersTeam = {"Vladislav", "Hasan", "Tolkun", "Abide"};
        String[] testersTeam = {"Zhibekchach", "Mohammed Sohrabi", "Nursultan"};
        String[] businessAnalysitsTeam = {"Lisa", "Ershad", "Naila"};
        String[][] scrumTeam = {developersTeam, testersTeam, businessAnalysitsTeam};
        int maxLength = scrumTeam[0][0].length();
        String longestString = "";

        for (String[] each1DArray : scrumTeam) {
            for (String eachElement : each1DArray) {
                if (maxLength < eachElement.length()) {// to compare which string has the largest length
                    maxLength = eachElement.length();
                    //to assign maximum string length
                    longestString = eachElement;  //Finding the exact word that has 16 characters
                }
            }
        }
        System.out.println("Max Length of the longest word or name is: " + maxLength);
        System.out.println(longestString);


    }
}
