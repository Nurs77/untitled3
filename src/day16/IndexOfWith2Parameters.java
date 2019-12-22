package day16;

public class IndexOfWith2Parameters {
    public static void main(String[] args) {
        //             01234567890123456789012345
        String name = "I love JAVA JAVA JAVA JAVA";

        //get the second java from the sentence
        //assume you already know there is 4 Java in this sentence
        //second java means --> the Java showed up after first Java

        //first find out where is the first Java showed up
        //in order to find second one,
        //instead of searching from beginning, search from
        //search from right after the location you found first Java
        //then it will give you the index of second java

        //But how doI start from different location when using IndexOf
        //Because index of always starts from the beginning

        //indexOf method has 2 version 1 expectt 1 external data
        //another expect 2 external data --> yourstring.indexOF(0
        System.out.println(name.indexOf("JAVA"));
        System.out.println(name.indexOf("JAVA", 7));
        System.out.println(name.indexOf("JAVA", 8));

        System.out.println(name.indexOf("JAVA", 9));
        System.out.println(name.indexOf("JAVA", 15));
        //How do I start from the location that get past first Java
        //basically starting point different that 0 so that it get past first JAVA

        int firstJavaLocation = name.indexOf("JAVA");
        int startingPointToSearchSecondJava = firstJavaLocation + 1;

        int secondJavaLocation = name.indexOf("JAVA", startingPointToSearchSecondJava);
        System.out.println("secondJavaLocation = " + secondJavaLocation);

        //I do not know how many word in this sentence. I only know there 3+ words
        //I just want to know what is the second word
        //the word in between first space and second space is second word
        int firstSpace = name.indexOf(" ");
        int secondSpace = name.indexOf(" ", firstSpace+1);
        System.out.println("Second word in this sentence is " + name.substring(firstSpace +1,secondSpace));
    }
}
