package day21;

public class NameBreaker {
    public static void main(String[] args) {
        String name="NUrsultan";
        for(int x=0;x<name.length();x++){
            if(name.substring(x,x+1).equalsIgnoreCase("l")){
                System.out.println("FOund it!");
                break;
            }
            System.out.println(name.substring(x,x+1));

        }

        for (int x = 0; x < name.length(); x++) {
            String currenChar = name.substring(x,x+1);
            if(currenChar.equalsIgnoreCase("l")){
                System.out.println("FOUND IT");
                break;
            }
            System.out.println(currenChar);
        }
        for (int x = 0; x < name.length() ; x++) {
            char currentChar = name.charAt(x);
            if(currentChar=='l'){
                System.out.println("FOUND IT");
                break;
            }
            System.out.println(currentChar  );
        }

    }
}
