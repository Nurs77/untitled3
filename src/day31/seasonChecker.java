package day31;



public class seasonChecker {
    public static void main(String[] args) {
String mySeason = "AAA";
seasonActtion("Winter");
seasonActtion("Summer");
seasonActtion(mySeason);

    }
    public static void seasonActtion(String season){

        switch(season){
            case "Spring":
                System.out.println("Hiking");
                break;
            case "Summer":
                System.out.println("Swimming");
                break;
            case "Fall":
                System.out.println("Pumpking picking");
                break;
            case "Winter":
                System.out.println("Go snowboarding");
                break;
            default:
                System.out.println("Invalid");
        }
    }
}
