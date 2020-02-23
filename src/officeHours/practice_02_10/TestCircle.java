package officeHours.practice_02_10;


    class circle{
        public double radius;

        public circle(double radius) {
            this.radius = radius;
        }
        public boolean equals(Object O){
            if(O instanceof circle) {
                if (radius == ((circle) O).radius) {
                    return true;
                }
            }
                return false;


        }
    }


    public class TestCircle{
        public static void main(String[] args) {
            circle c1= new circle(3.5);
            circle c2 = new circle(4);
            Object c3 = new String();
            System.out.println("c1.equals(c2) = " + c1.equals(c2));
            System.out.println("c2.equals(c3) = " + c2.equals(c3));

        }
}
