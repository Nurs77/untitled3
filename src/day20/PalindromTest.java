package day20;

public class PalindromTest {
    public static void main(String[] args) {

        //if you reverse a String if it does not change it means
        // the string is called Palindrome
        String name = "kayak";
        System.out.println("name= " + name);
        String reversedName = "";
        for (int x = name.length() - 1; x >= 0; x--) {
            reversedName = reversedName + name.charAt(x);

        }
        System.out.println("reversedName = " + reversedName);
        if(name.equalsIgnoreCase(reversedName)){
            System.out.println("Palindrome test has passed");
        }else{
            System.out.println("Palindrome test ahs failed");
        }

    }
}
