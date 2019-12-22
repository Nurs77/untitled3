package day24;

public class practice {
    public static void main(String[] args) {
        /*
        Create a String array of 6 items to store groceryItems
        {"apple","banana","grape","strawberry","blueberry","kiwi"}
        Create a float array of 6 float values to store prices
        { 1.99f,   0.99f,    4.65f,    3.89f,     3.88f,   2.88f  }
        assume that the order of grocery Items match the prices in same order.
         */
        String[] groceryItems = {"apple","banana","grape","strawberry","blueberry","kiwi"};

        for(String eachFruit: groceryItems){
            System.out.print(eachFruit+ " ---> ");
        }
//print everything in one line without the arrow at the end or a comma
//assume u know the last item is kiwi
        //if the fruit you are checking is kiwi, just don't add it
        //How to get last item of any array programmatically ? arr[arr.lenght-1]
        int itemCount = groceryItems.length;
        System.out.println();
                int lastItemIndex =  itemCount-1;
                String lastFruit = groceryItems[lastItemIndex];
                for(String eachFruit: groceryItems){
                    System.out.print(eachFruit);
                    //only print arrow when the fruit is not last item
                    if(!eachFruit.equals(lastFruit)){
                        System.out.print(" ---> ");
                    }

                }
    }
}
