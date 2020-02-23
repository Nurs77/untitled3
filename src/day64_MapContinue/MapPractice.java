package day64_MapContinue;

import java.util.*;

public class MapPractice {
    public static void main(String[] args) {


        Map<String, List<String>> groupMap = new HashMap<>();
        groupMap.put("PowerOf4", Arrays.asList("Furkan","Daria","Serife"));
        groupMap.put("Achievesrs",Arrays.asList("Maiia","Anastasia"));
        groupMap.put("BugHunter",Arrays.asList("Ayse", "Rabiyam","Gulzina"));
        groupMap.put("BugBuseter",Arrays.asList("Rukhshona", "fariza"));
        groupMap.forEach((groupCode,allMemebers)-> System.out.println("groupCode = " + groupCode+"\n \t members: "+allMemebers) );
        System.out.println(groupMap.get("Achievesrs").get(1));
        System.out.println(groupMap.get("BugHunter").contains("Gulzina"));

        groupMap.put("Justice League", new ArrayList<>(Arrays.asList("Superman", "Batman", "WonderWoman")));
        groupMap.get("Justice League").add("Flash");
        System.out.println("groupMap.get(\"Justice League\") = " + groupMap.get("Justice League"));


    }
}
