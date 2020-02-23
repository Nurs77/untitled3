package officeHours.practice_02_04;

public class TestDevice {
    public static void main(String[] args) {
        Device s = new Samsung();
        s.price = 999;
        s.size = 9;

       s.call();

        s.call();
        s.sendMessage();
        iPhone i = new iPhone();
        i.model = "iPhone XS";
        i.price = 1299;

        i.call();
        i.sendMessage();
    }
}
