package day59_Exception_Continue;

public class General {
    public static void main(String[] args) {
        System.out.println("The Start");
        String str = " ";
        try{
            System.out.println(str.charAt(0));
            System.out.println("End of Try");
        }catch (NullPointerException e){
            System.out.println("No OBJECT HERE!!!!");

        }catch (Exception bla){
            System.out.println("THIS IS THE REST OF EXCEPTIONS");
        }
        System.out.println("END SUKA!");
    }
}
