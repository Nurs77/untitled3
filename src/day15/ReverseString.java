package day15;

public class ReverseString {
    public static void main(String[] args) {
        String name = "Akbar";
        System.out.println( name.charAt(4) + " " + name.charAt(3) + " " + name.charAt(2)+ " "+ name.charAt(1) + " "+ name.charAt(0));
int characterCount = name.length();
int lastCharIndex = characterCount - 1;
char lastChar = name.charAt(lastCharIndex);
        System.out.println(lastChar);

        System.out.println("Last char in one shotz: " +name.charAt( name.length()-1));

    }
}
