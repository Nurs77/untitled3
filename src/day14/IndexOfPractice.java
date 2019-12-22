package day14;

public class IndexOfPractice {
    public static void main(String[] args) {
        String name = "Game of Java";

        System.out.println("find out the location of Java");
        System.out.println( name.indexOf("Java"));
        System.out.println("find out the location of o");
        System.out.println(   name.indexOf("o"));
        System.out.println("find out the location of 0");
        System.out.println(    name.indexOf("O"));

        System.out.println("last location the letter a shows up");
        System.out.println(name.lastIndexOf("a"));
        System.out.println("last location the spasce");
        System.out.println(name.lastIndexOf(" "));
        System.out.println("last location the letter Ga");
        System.out.println(name.lastIndexOf("Ga"));


        System.out.println("location of Kawa");
        System.out.println( name.lastIndexOf("Kawa"));


    }
}
