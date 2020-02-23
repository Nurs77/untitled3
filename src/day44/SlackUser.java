package day44;

public class SlackUser {
   protected String name;
   protected String status;
   public void sendMessage(){
       System.out.println("slack user " + name + " sending message");
   }
   public void callSomeone(){
       System.out.println("slack user " + name + " calling");
   }
   public void addEmoji(){
       System.out.println("slack user "+ name+ " adding emoji");
   }


}
