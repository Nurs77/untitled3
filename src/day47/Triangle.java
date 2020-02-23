package day47;

import day44.Train;

public class Triangle extends Shape {
int base;
int height;

public Triangle(){
    super("triangle");

}

    @Override
    public void calculateArea() {
    area = height*base/2;



    }

    @Override
    public String toString() {
        return "Triangle{" +
                "base=" + base +
                ", height=" + height +
                ", name='" + name + '\'' +
                ", area=" + area +
                '}';
    }

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.name="triangle";
        t1.base = 7;
        t1.height = 6;
        t1.calculateArea();
        System.out.println("t1 = " + t1);

    }
}
