package day17;

public class WhileLoopPractice {
    public static void main(String[] args) {
        int counter = 1;
        while (counter<=5){
            System.out.println(counter+" ");
            ++counter;

        }
        System.out.println();
        System.out.println("counter= " + counter); //at this point counter value is 6
        //now I want to count from 5=1 using same counter
        //if I use(counter>=1) as condition I will have these
        //    -> 6>=1 5>=1 4>=1 3>=1 2>=1 1>=1 true
        while(counter>1){
            --counter;
            System.out.print(counter+" ");

        }
        System.out.println();
        System.out.println("Count after decrement "+counter);
    }
}
