package day45;

public class Earth extends Planet {
    int population;

    public Earth(double gravity, int radius, boolean hasLife,int population){
        super(gravity, radius, hasLife);
        this.population = population;

    }
        //Adding toString method so we can print it out

    public static void main(String[] args) {

        Earth e1 = new Earth(9.81,5000,true,100000);
        System.out.println("e1 = " + e1);




    }


    public String toString() {
        return "Earth{" + "population is: "+ population+

                ", gravity=" + gravity +
                ", radius=" + radius +
                ", hasLife=" + hasLife +
                '}';
    }
}
