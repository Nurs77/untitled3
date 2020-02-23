package day53;

public class Apple extends Fruit {
    String type;
    public Apple(String taste, String color, String type) {
        super(taste, color);
        this.type=type;
    }

//    @Override
    public void digest() {
        System.out.println("Peel the "+type+ " to digest the apple easier and to taste its " + taste +"which has a "+color+" color"   );
}

    @Override
    public String toString() {
        return "Apple{" +
                "type='" + type + '\'' +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
