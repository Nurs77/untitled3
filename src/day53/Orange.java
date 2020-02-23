package day53;

public class Orange extends Fruit {
    int vcLevel;
    public Orange(String taste, String color,int vcLevel) {
        super(taste, color);
        this.vcLevel = vcLevel;

    }


    @Override
    public void digest() {
        System.out.println("the orange has "+vcLevel+ " vc levele and to taste its " + taste +"which has a "+color+" color"   );
    }

    @Override
    public String toString() {
        return "Orange{" +
                "vcLevel=" + vcLevel +
                ", taste='" + taste + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
