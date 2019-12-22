package day14;

public class StringReview {
    public static void main(String[] args) {
        String str = "I like Pumpkin";
        System.out.println("str");
        System.out.println(str);


        System.out.println(str.equals("pumpkin"));
        System.out.println(str.contains("Pumpkin"));

        
                                //true
        boolean gotPumpkin = str.contains("Pumpkin");
        System.out.println("gotPumpkin = " + gotPumpkin);

        //startsWith endsWith
        boolean startedWithI = str.startsWith("I");
        System.out.println("startedWith I = " + startedWithI);

        boolean endWithPumpkin = str.endsWith("Pumpkin");
        System.out.println("endWithPumpkin = " + endWithPumpkin);


    }
}
