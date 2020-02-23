package day35;

public class Task {
    public static void main(String[] args) {
        String sentence = "I bought 3 tomato and the price was 3.14 each";
        String[] spltting = sentence.split(" ");
        int count = Integer.parseInt(spltting[2]) ;
        double price = Double.parseDouble(spltting[spltting.length-2]);

        System.out.println(count*price);
        System.out.println("=========");
        System.out.println(Integer.parseInt(spltting[2])* Float.parseFloat(spltting[spltting.length-2]));

    }
}
