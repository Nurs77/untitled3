package day37;

import java.util.ArrayList;

public class ArrayList_loopPractice {
    public static void main(String[] args) {
        ArrayList<String> nameLst = new ArrayList<String>();
        nameLst.add("Qalbinur");
        nameLst.add("Ruzi");
        nameLst.add("Sabahiddin");
        nameLst.add("Sabahiddin");
        nameLst.add("Nursultann");
        nameLst.add("Guzelnur");
        nameLst.add("Muyesser");
        nameLst.add("Mustafa");
        System.out.println("nameLst = " + nameLst);
        //find the longest name
        String longestName = nameLst.get(0);
        for (int i = 0; i < nameLst.size(); i++) {
            String eachName = nameLst.get(i);

            if (eachName.length() >= longestName.length()) {
                longestName = eachName;

            }
        }
        System.out.println("longestName = " + longestName);

        for (int i = 0; i <nameLst.size() ; i++) {

            if(nameLst.get(i).length()==longestName.length()){

                System.out.println("Longest words :" + nameLst.get(i));
            }

        }


    }
}