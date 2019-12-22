package day15;

public class StringCaseInsenstiveCheck {
    public static void main(String[] args) {

        String name = "Arya Stark";

        System.out.println("Name contains st??? " + name.contains("st"));

        String uppercaseName = name.toUpperCase();
        System.out.println("uppercaseName.contains(ST) = " + uppercaseName.contains("ST"));


        String lowerCaseName = name.toLowerCase();
        System.out.println("lowerCaseName.contains(\"st\") = " + lowerCaseName.contains("st"));

        System.out.println( name.toLowerCase().contains("st"));






    }
}
