package day41;

public class Tv_Attributes {
    String name;
    boolean isOn;
    int currentChannel;





    public int getCurrentChannel(){
        return currentChannel;
    }
public void setNewChannel(int newChannel){

        if(newChannel<0||newChannel>50){
            System.out.println("Invalid CHANNEL< GET THE FUCK OUT");
            return;
        }
        if(isOn==true){
            currentChannel=newChannel;
        }else{
            System.out.println("Turn On the the TV FIRST!!!!!");
        }


}

    public  void turnOn(){
        if(isOn ==false){
            System.out.println("Turning on");
            isOn=true;

        }

    }
    public void turnOff(){
        if(isOn==true){
            System.out.println("Turning off");
            isOn=false;
        }
    }

    @Override
    public String toString() {
        return "Tv_Attributes{" +
                "name='" + name + '\'' +
                ", isOn=" + isOn +
                ", currentChannel=" + currentChannel +
                '}';
    }
}
