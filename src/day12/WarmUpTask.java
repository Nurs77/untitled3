package day12;

public class WarmUpTask {
    public static void main(String[] args) {

        String weather = "Rainy";
        System.out.println("What is the weather like right now? ");
        if(weather.equals("Sunny")){
            System.out.println("Code in sun");

        }else if(weather.equals("Rainy")){
            System.out.println("Code in rain");
        }else if(weather.equals("cloudy")){
            System.out.println("COde under cloud");
        }else {
            System.out.println("Keep coding anyway");
        }
    }
}
