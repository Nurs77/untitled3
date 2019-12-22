package day21;

public class WakeUpTask1_NamePrinter {
    public static void main(String[] args) {
        String name = "MY NAME IS NURSULTAN";
        int charCount = name.length();
        int lasChar = charCount-1;
// one letter
        for (int i = 0; i<=lasChar; i++) {
            System.out.print(name.substring(i,i+1)+"->");
        }
// double letter
        System.out.println();
        for (int i = 0; i<=lasChar-1; i++) {
            System.out.print(name.substring(i,i+2)+"->");
        }
//three letter
        System.out.println();

        for (int i = 0; i<=lasChar-2; i++) {
            System.out.print(name.substring(i,i+3)+"->");
        }

    }
}
