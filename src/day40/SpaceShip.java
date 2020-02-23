package day40;

public class SpaceShip {
    String name;
    int xCoordinate;
    int yCoordinate;
    String currentDirection;

    public void setInitialPosition(int newX, int newY){
        xCoordinate=newX;
        yCoordinate=newY;
    }




    public  void setNewDirAndMove1Block(String newDirection){
        currentDirection=newDirection;
        if(newDirection.equalsIgnoreCase("up") ||
                newDirection.equalsIgnoreCase("down") ||
                newDirection.equalsIgnoreCase("right") ||
                newDirection.equalsIgnoreCase("left")){
            currentDirection=newDirection;
        }else{
            System.out.println("invalid direction");
            currentDirection="";
        }
        if(currentDirection.equalsIgnoreCase("up"))
        {
            yCoordinate++;
        }
        if(currentDirection.equalsIgnoreCase("down"))
        {
            yCoordinate--;
        }
        if(currentDirection.equalsIgnoreCase("right"))
        {
            xCoordinate++;
        }
        if(currentDirection.equalsIgnoreCase("left"))
        {
            xCoordinate--;
        }
    }
    public String toString(){
        return "Name: "+name + "| direction: " +currentDirection +" | xCoordinate: "+xCoordinate+" | yCoordinate: "+yCoordinate;
    }
}
