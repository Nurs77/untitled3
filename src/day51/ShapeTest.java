package day51;

import java.util.Arrays;
import java.util.List;

public class ShapeTest {
    public static void main(String[] args) {
        Shape s1 = new Triangle();
        Shape s2 = new Rectangle();
        Shape s3 = new Circle();

        s1.draw();
        s2.draw();
        s3.draw();

        Shape[] allShpaes = {s1,s2,s3, new Triangle(),s2};
        System.out.println("+========FOR EACH=========+");
        for(Shape each : allShpaes){
            each.draw();
        }
        System.out.println("========FOR LOOP =============");
        for (int i = 0; i <allShpaes.length ; i++) {
            allShpaes[i].draw();

        }
        System.out.println("=========== FOR EACH WITH LIST (Shape eachShape: shapeList) ==============");
        List<Shape> shapeList = Arrays.asList(s1,s2,s3,s2,s1);
        for(Shape eachShape: shapeList){
            eachShape.draw();
        }
        System.out.println("========FOR LOOP WITH LIST (shapeList.size())=========+");
        for (int i = 0; i <shapeList.size() ; i++) {
            shapeList.get(i).draw();

        }

    }
}
