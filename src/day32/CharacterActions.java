package day32;

public class CharacterActions {
    public static void main(String[] args) {


    printAtoZ();
    printZtoA();
printAlphabetInRange('a','F');
}


public static void printAlphabetInRange(char beginning, char ending){
        if(beginning<ending){
            System.out.println("We need to increment "+beginning+ " till "+ending);
            for(char iChar = beginning; iChar<=ending;iChar++){
                System.out.print(iChar+ " ");
            }
            System.out.println();
        }else if(beginning>ending){
            System.out.println("We need to decrement from "+beginning+" till "+ ending);
            for (char iChar = beginning; iChar >=ending ; iChar--) {
                System.out.print(iChar+" ");

            }
            System.out.println();
        }else{
            System.out.println("They are same characters!!!!");
        }
}

    /*


    * printAtoZ
    * create a method that has no parameter
	    and print A-Z in one line
    *
    * */
    public static void printAtoZ() {
        //'A'++ -->> 'B'
        for (char iChar = 'A'; iChar <= 'Z'; iChar++) {
            System.out.print(iChar + " ");
        }
        System.out.println();// so we can move to next line
    }

    /*
    * printZtoA
    * create a method that has no parameter
	    and print Z-A in one line
    *
    * */
    public static void printZtoA() {
        // this is how we can print in descending order
        // 'Z'-- -->> 'Y'
        for (char iChar = 'Z'; iChar >= 'A'; iChar--) {
            System.out.print(iChar + " ");
        }
        System.out.println();// so we can move to next line
    }
}
