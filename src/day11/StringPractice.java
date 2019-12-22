package day11;

public class StringPractice {
    public static void main(String[] args) {
        System.out.println("Java".equals("java"));
        String myStr = "Cava";
        System.out.println(myStr.equals("Java"));
        String yourStr = new String("Java");
        System.out.println("Are they similar?");
        System.out.println(myStr.equals(yourStr));
        if(myStr.equals("Java")){
            System.out.println("COrrect WORD!!!!");
        }else if(myStr.equals("Cava")){
            System.out.println("NET NAHUI");

        }else {
            System.out.println("POWEL NAHUI");

        }
    }
}
