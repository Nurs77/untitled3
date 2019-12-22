package day16;

public class SecondWord {


    public static void main(String[] args) {
        String sentence = "I LOVE JAVA";
        String secondWord;
        //getting location of space remind me of indexOF
        //Getting String inside another string by beginning and ending index
        //remind me of substring

        int firstSpaceIndex = sentence.indexOf(" ");
        System.out.println("firstSpaceIndex = " + firstSpaceIndex);

        int lastSpaceIndex = sentence.lastIndexOf(" ");
        System.out.println("lastSpaceIndex = " + lastSpaceIndex);

        System.out.println(sentence.substring(0));
        secondWord = sentence.substring(firstSpaceIndex+1,lastSpaceIndex);
        System.out.println("secondWord = " + secondWord);

        String lastWord = sentence.substring(lastSpaceIndex+1);
        System.out.println("lastWord = " + lastWord);



    }
}
