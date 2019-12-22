package day21;

public class SearchingSomethingInStringTwo {
    public static void main(String[] args) {

        //             01234567890123456789012345678901234567890
        String name = "MY NAME IS NURSULTAN pakistan uzbekistan";
        int charCount = name.length();
        System.out.println("charCount = " + charCount);
        int lasChar = charCount-1;
        System.out.println("lasChar = " + lasChar);
int counter =0;
        /*
        Find out index of all the letter a in cases insentive manner
        I will go through each and every letter of the String
        --> each character i can use substring(0,1) and so on
        ---> going to 0 to last index -->> for loop

        while I am going through each and every 2 character
            I will check wheter current character i am looking at
            equals to a or A --> currentCharacter.equalsIgnoreCase("a")
            if it is I will print the index   println(the variable you use to keep the index)
            if not --> just move on
            // perform this action until I reach last character if I go over last character index I stop


         */
        System.out.println("---2 char----");
        for(int x =0; x<= lasChar-2; x++){
            String currentChar = name.substring(x,x+3);
            if(currentChar.equalsIgnoreCase("tan")){
                System.out.println("The index of an or AN is at " +x);

                counter++;
            }
        }

    }
}
