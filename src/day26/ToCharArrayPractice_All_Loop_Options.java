package day26;

public class ToCharArrayPractice_All_Loop_Options {
    public static void main(String[] args) {
        //toCharArray() , another is split(bySomething)

        String survey = "Comple B15 Online 1 month survey";
        char[] surveyChars = survey.toCharArray();
        // how did determine to use char for each??
        // because each item in char array is char
        //




        //=====( 1 ) FOR EACH LOOP
        for (char each : surveyChars
             ) {
            System.out.println("each char is : " + each);

        }
        // ========= ( 2 ) For Loop
        for (int i = 0; i < surveyChars.length ; i++) {
            System.out.println("each char is : " + surveyChars[i]);

        }
        //just for ( 3 ) FUN WHILE LOOP
        System.out.println("==================================");
        int x =0;
        while(x<surveyChars.length){
            System.out.println("each char is : " + surveyChars[x]);
            x++;
        }

        // DO While LOOP ( 4 )
        int y=0;
        do{
            System.out.println(surveyChars[y]);
            y++;
        }while(y<surveyChars.length);
    }
}
