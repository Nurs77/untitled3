package day60_Exception_Continue;

import java.util.*;

public class CollectionsIntro {
    public static void main(String[] args) {


        //List<String> names = new ArrayList<>();
    /*
    List interface extends Collection interface
    and ArrayList implements List interface
    So we can safely
     */

        Collection<String> names = new ArrayList<>();
        // with this assignment we can access only what collection interface have
        // so we can learn what any type of Collection including Set, Queue,
        //                      List have in common
        names.add("Nursultan");
        names.add("Tolgonai");
        names.add("Kotok");

       // System.out.println("first item "+ names.get(0));
        names.addAll((names));
        names.removeAll(Arrays.asList("Nursultan"));
        Collection<String> toRemoveList = Arrays.asList("Kotok");
        names.removeAll(toRemoveList);
//        System.out.println("names = " + names);
//
//        for(String eachName: names){
//            System.out.println("eachName = "+eachName);
//
//        }
        names.forEach(each -> System.out.println("each = "+ each));

    }
/*
The word Collection everywhere:
Collection Framework --> referring entire things, entire topic

Collection Interface --> one interface under the entire Collection Framework

Collections Class --> (it has "s" at the end just like Array and Arrays)
                    --> it is a utility class with many static methods
                      for ex: Collections.sort(your collection object)

 */

}
