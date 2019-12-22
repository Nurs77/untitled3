package day26;

import java.util.Arrays;

public class MorePractice {
    public static void main(String[] args) {
        String survey = "COmple B15 Online";
        char[] surveyChars = survey.toCharArray();
        System.out.println("BEfore survey chars: "+ Arrays.toString(surveyChars));
        Arrays.sort(surveyChars);
        System.out.println("After surveyChars: "+ Arrays.toString(surveyChars));
}
}
