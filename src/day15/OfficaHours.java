package day15;

public class OfficaHours {
    public static void main(String[] args) {
        String message = "I Love java";
        //trim ---> take out spaces at the beginning and ending of a String object
        System.out.println("message = <" + message + ">");

        String messageTrimmed = message.trim();

        System.out.println("messageTrimmed = <" + messageTrimmed + ">");

        //isEmpty
        String emptySpaces = "    ";
        System.out.println("emptySpaces = <" + emptySpaces + ">");

        String emptySpacesAfterTrimmed = emptySpaces.trim();
        System.out.println("emptySpacesAfterTrimmed length is :  " + emptySpacesAfterTrimmed.length());
        System.out.println("emptySpacesAfterTrimmed is empty " + emptySpacesAfterTrimmed.isEmpty());

        System.out.println("emptySpaces is blank or not??  " + emptySpaces.isBlank());

        //indexOF

        int locationofLove = message.indexOf("Love");
        System.out.println("locationofLove = " + locationofLove);

        //contains : ----> check where a string exists inside anotherString and return true false

        boolean messageContainsLove = message.contains("Love");
        System.out.println("messageContainsLove = " + messageContainsLove);




    }
}
