package day44.sub;

import day44.SlackUser;

public class SlackAdminUser extends SlackUser {
    int adminId;
    public SlackAdminUser(String name, String status, int adminId){
        this.adminId=adminId;
        this.name=name;
        this.status=status;

    }
    
    
    
    

    public static void main(String[] args) {
     SlackAdminUser user1 = new SlackAdminUser("Akbar", "Release the horses", 77);
            user1.sendAtMessage();
            user1.callSomeone();
            user1.addEmoji();
            user1.addChannel();
            user1.deleteMessage();
            user1.sendMessage();
        System.out.println("user1 = " + user1);
        

        
        
    }
    
    
    
    
    
    
    
    public void sendAtMessage(){
        System.out.println(name+" sending message");
    }

    public void deleteMessage(){
        System.out.println(name+ " deleting message");
    }
    public void addChannel(){
        System.out.println(name+ " adding channel");
    }

    @Override
    public String toString() {
        return "SlackAdminUser{" +
                "adminId=" + adminId +
                ", name='" + name + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
