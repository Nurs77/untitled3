package day17;

public class BackwardEven {
    public static void main(String[] args) {
        int num = 100;
        while(num>1){
            if(num%2==0){
                System.out.print(num+" ");
            }
            --num;
        }

    }
}
