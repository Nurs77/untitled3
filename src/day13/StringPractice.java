package day13;

public class StringPractice {
    public static void main(String[] args) {
      String name = "Nursultan";
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.length());

        int lengthOfStr= name.length();
        if(lengthOfStr>4){
            System.out.println("MOre than 4 char");
        }else{
            System.out.println("Not more than 4");
        }
    }
}
