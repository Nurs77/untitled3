package officeHours;

public class practice_01_02 {
    public static void main(String[] args) {
        String str = "AABBDDEE";

        System.out.println(Duplicate(str));
        System.out.println(frequency("ABSDGADAA",'A'));
        System.out.println(frequencyOfChars(str));;
    }
    public static String Duplicate(String str){

        String result1 = ""; //storing non duplicate
        for (int i = 0; i <str.length() ; i++) {
            if(! result1.contains(str.substring(i,i+1))){
                result1+=str.substring(i,i+1);
                //      (0, 1) ==> A at index 0
                //      (1, 2) ==> A at index 1

            }

        }



        //task 2 frequency
        return result1;
    }
    public static int frequency(String str,char ch){
        int count = 0; // count how many times the char is occured in str
        char[] arr = str.toCharArray(); //[A,B,C,A,B,C]
        for(char each: arr){
            if(each == ch){
                count+=1;
            }
        }
        return count;
    }
    //TASK 3 Frequincy inside count
    public static String frequencyOfChars(String str){
        String result = "";
        String nonDup = Duplicate(str); // ABDE
        for (int i = 0; i <nonDup.length() ; i++) {


          int count =   frequency(str, nonDup.charAt(i));
            result += ""+ nonDup.charAt(i)+count;
        }
    return result;
    }


}
