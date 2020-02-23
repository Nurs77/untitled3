package day50;

public class Square extends Shape {
    int lenght;

    public Square(String name, int lenght) {
        super(name);
        this.lenght = lenght;
    }

    @Override
    public void calculateArea() {
    area = lenght*lenght;
    }

    @Override
    public void draw() {
        System.out.println("Draw 4 equal line with lenght "+lenght+" with color "+ COLOR);
    }

    @Override
    public String toString() {
        return "Square{" +
                "lenght=" + lenght +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
