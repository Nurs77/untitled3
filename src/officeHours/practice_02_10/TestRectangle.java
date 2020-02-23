package officeHours.practice_02_10;

class rectangle{

    public double l, w;

    public rectangle(double l, double w){
        this.l=l;
        this.w=w;
    }
    public boolean equals(Object O){
        if(O instanceof rectangle){
            double Are1 = l*w;
            double Area2 = ((rectangle) O).l*((rectangle)O).w;
            if(Are1==Area2){
                return true;
            }
        }
        return false;
    }

}


public class TestRectangle {

    public static void main(String[] args) {

        rectangle r1 = new rectangle(3,4);
        rectangle r2 = new rectangle(5,3);
        System.out.println("r1.equals(r2) = " + r1.equals(r2));

    }

}
