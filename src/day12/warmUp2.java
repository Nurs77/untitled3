package day12;

public class warmUp2 {
    public static void main(String[] args) {
        int score = 2;
        if(score<1 && score >12){
            System.out.println("Invalid month mtfkr");

        }else if(score>=3 && score<=5){
            System.out.println("SPRING BLYAT");
        }else if(score>=6 && score<=8){
            System.out.println("Summer IDIOT");
        }else if(score>= 9 && score<=11){
            System.out.println("FALL IDIOT");
        }else {
            System.out.println("WINTER");
        }
    }
}
