package day51;

public abstract class  Shape {
    public abstract void draw();

}
class Triangle extends Shape{
    @Override
    public void draw() {
        System.out.println("DRAWING Triangle");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("DRAWING Rectangle");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("DRAWING Circle");
    }
}
