package officeHours.practice_02_04;

public abstract class Device implements WaterProof {
    int size;
    int price;
    public void call(){
        System.out.println("Calling the device");
    }
    public abstract void sendMessage();

}
