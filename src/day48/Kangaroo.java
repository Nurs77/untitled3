package day48;

public class Kangaroo implements Bouncible {
    String name;
    int jumpDistance;

    public Kangaroo(String name, int jumpDistance) {
        this.name = name;
        this.jumpDistance = jumpDistance;
    }
    public void eat(){
        System.out.println("Kangaroo with the name "+name+" is eating");
    }

    @Override
    public void bounce() {
        System.out.println("This "+name+ " can jump "+ jumpDistance + " meters forward");
    }

    @Override
    public String toString() {
        return "Kangaroo{" +
                "name='" + name + '\'' +
                ", jumpDistance=" + jumpDistance +
                '}';
    }
}
