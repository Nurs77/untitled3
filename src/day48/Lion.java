package day48;

import java.util.ArrayList;
import java.util.List;

public class Lion extends Mamal {

    public static void main(String[] args) {
        Lion l1 = new Lion();
        l1.drinkMilk();
        l1.makeNoise();

        Animal a1 = new Lion();
        a1.makeNoise();
        List<Integer> lst = new ArrayList<>();


    }
    public void drinkMilk(){
        System.out.println("Lion DRINK MILK");
    }
    public void makeNoise(){
        System.out.println("LION SAY ROOOARRRRR");
    }
}
