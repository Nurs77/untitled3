package day37;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListWithStringPractice {
    public static void main(String[] args) {
        List<String> superHeros = new ArrayList<>();
        superHeros.add("Superman");
        superHeros.add("Batman");
        superHeros.add("Wonder Woman");
        superHeros.add("Cyborg");
        superHeros.add("Aquaman");
        superHeros.add("Flash");

        System.out.println("Superheroes = "+superHeros);
        //Copy
        List<String> superHeroCopy = new ArrayList<>(superHeros);
        System.out.println("superHeroCopy = \n\t " + superHeroCopy);
        //System.out.println("superheroes containg superman " +superHeros.contains("Superman"));
//        System.out.println("superheroes containg man " +superHeros.contains("man"));
// ===== REMOVING MAN =========
        for (int i = 0; i <superHeros.size() ; i++) {
            String currentHero = superHeros.get(i);
            if(currentHero.contains("man")){
                superHeros.remove(currentHero);
            // once hero is removed, this index will be filled with the next item
                //so we need to decrease the index by 1 to stay at the same index
                --i;
            }

        }
        System.out.println("superHeroes " +superHeros);

        List<String> topics = Arrays.asList("Java","Selenium", "Database");
        System.out.println("topics= \n\t" +topics);
        List<String> topicCopy = new ArrayList<>(topics);
        topicCopy.add(0,"Nursultan");
        System.out.println("topicCopy = " + topicCopy);
    }
}
