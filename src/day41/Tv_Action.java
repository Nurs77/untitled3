package day41;

public class Tv_Action {
    public static void main(String[] args) {
        Tv_Attributes tv1 = new Tv_Attributes();
        
        tv1.name = "Samsung";
        System.out.println("tv1 = " + tv1);
        tv1.currentChannel = 9;
        tv1.turnOn();
        tv1.setNewChannel(120);
        tv1.turnOff();
        tv1.setNewChannel(10);



    }
}
