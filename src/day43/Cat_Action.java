package day43;

import java.util.Arrays;
import java.util.List;

public class Cat_Action {
    public static void main(String[] args) {


        CatStore p1 = new CatStore();
        System.out.println("p1 = " + p1);
        p1.speak();
        CatStore p2 = new CatStore("horse", "Walter");
        CatStore p3 = new CatStore("goose", "Samantha");
        CatStore p4 = new CatStore("donkey", "Oliver");
        CatStore p5 = new CatStore("dog", "Henry");
        CatStore p6 = new CatStore("cow", "Adam");
        CatStore p7 = new CatStore("ant", "Atom");
        CatStore p8 = new CatStore("bear", "Teddy");
        CatStore p9 = new CatStore("cat", "Stephanie");

        List<CatStore> myPets = Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9);
        System.out.println("myPets = " + myPets);
        for (CatStore each : myPets) {
            if (each.getType().equalsIgnoreCase("cat")) {
                System.out.println("each pet name = " + each.getName());

            }
        }

    }

}
