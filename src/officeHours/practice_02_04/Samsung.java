package officeHours.practice_02_04;

public class Samsung extends Device {
    String color;

    @Override
    public void call() {
        System.out.println("Calling with Samsung");
    }
    public void sendMessage(){
        System.out.println("Samsung sending message....");
    }


}
