package day49;
// interface is like a contract,
//once someone sign a contract he/she will provide all the details that he/she does

public interface Edible {
    // IN INTERFACE fields are automatically public static final if not defined so.
    //public static final filed naming convention is ALL_CAPS!!

    public static final boolean IS_HUMAN_FOOD = true;
    //if a method with no body is not defined public abstract, it's automatically public abstract
    void eat();
    public abstract void drink();


    public default void digest(){
        System.out.println("You implement the code yourself and digest it");
    }


}
