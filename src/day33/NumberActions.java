package day33;

public class NumberActions {
    public static void main(String[] args) {
        int userNumber = 10;
        System.out.println(getSumFrom1toX(userNumber));
        System.out.println(bothNames("Nursultan","Tolepbergen"));

        String fullName = "Aibek Tolepbergen";
        String[] fullNameSplit = fullName.split(" ");
        String herMail = bothNames(fullNameSplit[0],fullNameSplit[1]);
//        System.out.println("Mail: "+ herMail);


    }

    /*
     *getSumFrom1toX
     * This method should calculate the sum of the numbers from 1 to the number user typed
     *
     *
     *
     */
    public static int getSumFrom1toX(int x) {
        int num = 0;
        for (int i = 1; i <= x; i++) {
            num = num + i;
        }
        return num;
    }

    public static String bothNames(String firstName, String lastName){
        String domain = "@NightsWatch.com";
        System.out.println(firstName.charAt(0)+lastName+domain);
        return "";


    }


}
