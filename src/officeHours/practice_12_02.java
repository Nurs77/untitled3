package officeHours;

public class practice_12_02 {
    public static void main(String[] args) {
        String item = "Echo Dot (3rd gen) Charcoal";

        System.out.println( item.substring(9 , 18));
        System.out.println(item.substring(10, 17));

        int indexOfOpeningParenthesis = item.indexOf("(");
        int indexOfEndingParenthesis = item.indexOf(")");
        String wordInsideParanthesis = item.substring(indexOfOpeningParenthesis + 1,
                indexOfEndingParenthesis);
        System.out.println("wordInsideParanthesis = " + wordInsideParanthesis);
        //-----------------------------

        String letters="J%a^V*******$a";
        letters=letters.replace("%", "")
                        .replace("^","")
                        .replace("*","")
                        .replace("$","")
        .toUpperCase();


        System.out.println("letters= " +letters);


    }
}
