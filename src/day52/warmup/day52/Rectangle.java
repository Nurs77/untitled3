package day52.warmup.day52;

public class Rectangle extends Shape {
    int length;
    int width;

    public Rectangle(String name, int length, int width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
    area = length*width;

    }

    @Override
    public void draw() {
        System.out.println("drawing shitty rectangle");
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "length=" + length +
                ", width=" + width +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }
}
