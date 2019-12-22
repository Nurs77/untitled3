package day09;

public class languagePicker {
    public static void main(String[] args) {
        System.out.println("Welcome to Cybertek Call Center");
        System.out.println("Please select your language option 1-7");

        int languageOption = 492;
        String greeting = "";
        switch (languageOption){
            case 1:
                greeting = "Hello";
                break;
            case 2:
                greeting = "Privet";
                break;
            case 3:
                greeting = "Szia";
                break;
            case 4:
                greeting = "Hola";
                break;
            case 5:
                greeting = "Salam";
                break;
            case 6:
                greeting = "Bonjour";
                break;
            case 492:
                greeting = "Merhaba";
                break;
            default:
                greeting = "POWEL NAHUI";
        }
        System.out.println("THis is how greeting is done : " + greeting);




        }


}
