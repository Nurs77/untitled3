package day29;

import java.util.Arrays;

public class HeroIdentityAdvanceLoop {
    public static void main(String[] args) {

        String[] allHeroes = {"Superman-Clark Kent",
                "Batman-Bruce Wayne",
                "Wonder Woman-Princess Diana",
                "Aquaman-Arthur Orin Curry",
                "Wonder Woman-Princess Diana",
                "Cyborg-Victor Stone",
                "The Flash-Barry Allen ",
                "Green Lantern-Hal Jordan",
                "Green Arrow-Oliver Queen",
                "Atom-Ray Palmer",
                "Hawkman-Carter Hall",
                "Hawkgirl-Shiera Hall",
                "Zantana-Zantana Zatara",
                "Martian Manhunter-John Jones"};
        //String heroX = "Superman-*********";
        //given a String with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name

        for (String names: allHeroes
             ) {
            String[] heroAr = names.split("-");

        String nikcname = heroAr[0];

        String fullname = heroAr[1];
        int nameCharCount = fullname.length();
        String star = "";
        for (int i = 0; i <nameCharCount ; i++) {
            star = star+"*";
        }
        System.out.println(names);
        System.out.println(nikcname+"-"+star);
        }



//        String[] heroAr = split("-");
//        System.out.println(Arrays.toString(heroAr));
//        String nikcname = heroAr[0];
//
//        String fullname = heroAr[1];
//        int nameCharCount = fullname.length();
//        System.out.println(nameCharCount);
//        String star = "";
//        for (int i = 0; i <nameCharCount ; i++) {
//            star = star+"*";
//
//        }
//        System.out.println(fullname);
//        System.out.println(star);
//        fullname=star;
//        System.out.println(hero1);
//        String heroX=nikcname+"-"+fullname;
//        System.out.println(heroX);




    }
}
