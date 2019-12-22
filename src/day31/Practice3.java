package day31;

public class Practice3 {
    public static void main(String[] args) {

        printOddNumbers1to100();
        System.out.println("===========");
        countDownFrom20to1();
        System.out.println();
nameSplit();
    }
    public static void  printOddNumbers1to100(){
        for (int i = 1; i <=100 ; i++) {
            if(i%2!=0){
                System.out.print(i+" ");
            }

        }
    }

    public static void countDownFrom20to1(){
        for (int i = 20; i >=1 ; i--) {
            System.out.print(i+" ");

        }
    }
public static void nameSplit(){
        String name = "Nurs";
        String splittedName = name.replace("","-");
    System.out.println(splittedName.substring(1,splittedName.length()-1));
}
}
