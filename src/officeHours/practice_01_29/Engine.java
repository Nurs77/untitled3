package officeHours.practice_01_29;

public class Engine{
    String type;
    int horsePower;
    public Engine(String type, int horsePower){
        this.horsePower = horsePower;
        this.type=type;

    }

    @Override
    public String toString() {
        return "Engine{" +
                "type='" + type + '\'' +
                ", horsePower=" + horsePower +
                '}';
    }
}
