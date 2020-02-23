package day44;

public class CyberHouse {
    private int houseNum;
    private String design;
    private static String neighbourHoodName= "Cybertek Ave";

    public CyberHouse(String design,int houseNum){
        this.design = design;
        this.houseNum = houseNum;

    }





    public void showAllInfo(){
        System.out.println("house: "+this.houseNum+"| design: " +this.design+"| neighborhood: "+neighbourHoodName);
    }

    public static void showNeighborHoodName(){
        System.out.println("neighborhoodName = "+ neighbourHoodName);

    }

}
