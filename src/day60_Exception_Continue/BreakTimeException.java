package day60_Exception_Continue;

public class BreakTimeException extends RuntimeException {

}
class Main{
    public static void main(String[] args) {
        //throw new BreakTimeException();
        try{
            throw new MyOwnException();
        }catch (MyOwnException e){
            System.out.println("Caching that shit");
        }
    }
}
