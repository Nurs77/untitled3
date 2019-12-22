package day23;

public class StringArrayPractice {
    public static void main(String[] args) {
        String[] shows = {"Orville" , "Gifted", "Game of Thrones", "Flash","Arrow","Supper girl"};
        int showsCount = shows.length;
        System.out.println("shows Count = " + showsCount);
        for (int i = 0; i <showsCount ; i++) {
            String currentSHow = shows[i];

            System.out.println(currentSHow+" has character count "+ currentSHow.length());


        }
        System.out.println("===========");
        String myFavShow="Orville";
//            System.out.println("myFavShow = " + myFavShow);
//            System.out.println("myFavShow character count is = " + myFavShow.length());
        System.out.println("My favorite show = "+myFavShow+ " char count is : "+ myFavShow.length());
        System.out.println("==============");
        for (int i = 0; i <showsCount ; i++) {
            //String currentSHow = shows[i];

            //System.out.println(currentSHow+" has character count "+ currentSHow.length());
            System.out.println(shows[i]+" has character count: " +shows[i].length());

        }
    }
}
