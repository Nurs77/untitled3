package day59_Exception_Continue;

public class FinallyBlock {
    public static void main(String[] args) {
        int[] nums = {1,4,6};
        try{
            System.out.println("nums[100] ="+ nums[100]);

        }catch (Exception e){
            System.out.println("Exeption caught \n "+ e.getMessage());

        }
        System.out.println("This code will always run no matter we have exception or not");
    }
}
