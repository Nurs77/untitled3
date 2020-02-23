package day36;

public class MethodPracticeIsDigit {
    public static void main(String[] args) {
        Boolean result1 = checkIfStringHasANumber("ydsajgeh");
        System.out.println("result 1 = " +result1);


    }

    /**
     * if string contains at least one number Boolean
     * @param str
     * @return true if contains at least one number
     */
    public static Boolean checkIfStringHasANumber(String str){
        for (int i = 0; i <str.length() ; i++) {

            if(Character.isDigit(str.charAt(i))){
                return Boolean.valueOf(true);
            }

        }
        System.out.println("NO Number found");
        return  Boolean.valueOf(false);
    }
}
