package day35;

public class  CharacterPractice2 {
    public static void main(String[] args) {

        char myChar = '7';
        int myNum = Integer.parseInt(myChar+"");
        System.out.println("myNum = " + myNum);
        System.out.println("ABOVE IS AN EXAMPL");
        //===============================================
        String str = "A3w321fsa42";
        char[] allChars = str.toCharArray();
        int sum = 0;
        for (char each: allChars) {
            if(Character.isDigit(each)){
                System.out.println("each = " + each);
                sum += Integer.parseInt(each+"");
            }
            
        }
        System.out.println("sum "+ sum);
    }
}
