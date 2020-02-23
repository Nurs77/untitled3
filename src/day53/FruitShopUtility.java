package day53;

public class FruitShopUtility {
    public static void main(String[] args) {
        Fruit f2 = new Apple("crispy but tasteless ", "hot red", "Gala");
        Fruit f3 = new Orange("sour ", "orange", 12);
        displayFruit(f3);
        displayFruit(f2);
        digestBetter(f2);
        System.out.println(getFavoriteByType(2));
    }
    public static void digestBetter(Fruit anyFruit){
       anyFruit.digest();
        anyFruit.digest();
        anyFruit.digest();
        anyFruit.digest();
        System.out.println(anyFruit);

    }
    public static void displayFruit(Fruit anyFruit){
        System.out.println("Displaying fruit \n" +anyFruit.toString());

    }
    public static Fruit getMyFavoriteFruit(){
        Fruit f = new Orange("crispy"," green", 100);
        return f;

    }
    public static Fruit getFavoriteByType(int type){
        if(type==1){
            return new Apple("crispy but tasteless ", "hot red", "Gala");

        }else if(type==2){
            return new Orange("sour ", "orange", 12);
        }
        return null;

    }
}
