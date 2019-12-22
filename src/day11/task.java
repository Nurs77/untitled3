package day11;

public class task {
    public static void main(String[] args) {
        int score = 30;
        if(score<0 && score >100){
            System.out.println("Invalid Score mtfkr");

        }else if(score==100){
            System.out.println("Perfect score");
        } else if(score>=70 && score<=100){
            System.out.println("you passed");
        }else if(score<20){
            System.out.println("Come to MY OFFICE IDIOT");
        }else if(score>= 30 && score<=40){
            System.out.println("ATTEND COURSES IDIOT");
        } else {
            System.out.println("Failed");
        }
    }
}
