package day40;

public class GalaxyAction {
    public static void main(String[] args) {
        SpaceShip s1 = new SpaceShip();
        s1.name = "SultanFly";
        s1.currentDirection = "up";
        s1.xCoordinate  = 77;
        s1.yCoordinate = 56;



        s1.setInitialPosition(1, 4);

        s1.setNewDirAndMove1Block("left");
        

        System.out.println("s1 SpaceShip = "+s1);
        
        s1.setNewDirAndMove1Block("right");
        System.out.println("s1 = " + s1);



    }
}
