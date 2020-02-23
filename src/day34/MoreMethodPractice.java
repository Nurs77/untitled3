package day34;

public class MoreMethodPractice {
    public static void main(String[] args) {
        System.out.println(monkeyTrouble(true,true));
        System.out.println(monkeyTrouble(false,false));
        System.out.println(monkeyTrouble(true,false ));
    }
    /**
     * @param aSmile
     * @param bSmile
     * @return
     */
    public static String  monkeyTrouble(boolean aSmile, boolean bSmile){

        if((aSmile&&bSmile)||(!aSmile&!bSmile)){
            return "yes";

        }
        else{
            return "No";

        }
    }
}
