package day51;

public class AnimalSHow {
    public static void main(String[] args) {
      //  Dog d1 = new Dog();
        Animal a1 = new Dog(); // we are referring Dog object using Animal reference
        a1.makeNoise();

        a1= new Horse();
        a1.makeNoise();
    }
}
