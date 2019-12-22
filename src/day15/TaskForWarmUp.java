package day15;

public class TaskForWarmUp {
    public static void main(String[] args) {
        String name = "Nursultan";

        int lengthOfMyName = name.length();
        if(lengthOfMyName>11){
            System.out.println("name is long");

        }else{
            System.out.println("medium name");
        }


        if (name.contains("a") || name.contains("e")) {
            System.out.println("Name contains a or e");
        } else {
            System.out.println("I don't have any of it");
        }




    }
}
