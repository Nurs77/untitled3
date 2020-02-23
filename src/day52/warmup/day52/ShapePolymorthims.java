package day52.warmup.day52;

public class ShapePolymorthims {
    public static void main(String[] args) {
Circle s1= new Circle("penny",5);
  //     Shape s2= new Circle("penny",5);
        //Drawable d1 = new Circle("penny",5);
        s1.draw();
        
s1.calculateArea();
        System.out.println(s1);
        Rectangle r1 = new Rectangle("Money", 10,5);
        r1.draw();
        r1.calculateArea();
        System.out.println(r1);
        
        Object o1 = new Circle("yaica", 2);
        System.out.println("=========Object way to call the methods=========");
        System.out.println(o1.toString());
        System.out.println(o1.getClass().getSimpleName());
        System.out.println("================");
        Shape s4 = new Circle("CHlen",5);
        printAnyShapeArea(s4);
        Shape s5 = new Rectangle("Book", 10, 5);
        printAnyShapeArea(s5);
        printAnyShapeArea(new Square("Bob", 6));
        drawShape3times(s5);

    }
    public static void printAnyShapeArea(Shape anyShape){
        anyShape.calculateArea();
        System.out.println(anyShape.name+" is area is= " +anyShape.area);
    }
    public static void drawShape3times(Shape anyShape){
        for (int i = 0; i <3 ; i++) {
            anyShape.draw();

        }
    }
}
