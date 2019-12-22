package day29;

import java.util.Arrays;

public class HeroIdentity {
    public static void main(String[] args) {

        String hero1 = "Superman-Clark J Kent";
        //String heroX = "Superman-*********";
        //given a String with hero code and name separated by -
        // turn this String into hero code and * with same length as hero name
        String[] heroAr = hero1.split("-");
        System.out.println(Arrays.toString(heroAr));
        String nikcname = heroAr[0];

        String fullname = heroAr[1];
        int nameCharCount = fullname.length();
        System.out.println(nameCharCount);
        String star = "";
        for (int i = 0; i <nameCharCount ; i++) {
            star = star+"*";

        }
        System.out.println(fullname);
        System.out.println(star);
        fullname=star;
        System.out.println(hero1);
        String heroX=nikcname+"-"+fullname;
        System.out.println(heroX);




    }
}
