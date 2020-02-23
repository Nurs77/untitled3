package day62_SetInterface;

import java.util.*;

public class SetInterface2 {
    public static void main(String[] args) {
        // Creating a HashSet with items already inside
        // REMEMBER : in HashSet THERE IS NO DEFINED ORDER!!!!!!!!!!!!!
        // YOUR OUTPUT CAN BE IN ANY ORDER JAVA DESIRE


        List<Integer> numList = Arrays.asList(10, 10, 20, 20, 30, 30, 30, 30, 30);
        System.out.println("numList = " + numList);
        Set<Integer> myNumSet = new HashSet<>(numList);
        System.out.println("myNumSet = " + myNumSet);

        //Create a Set of String called states
        //add bunch of states
        //iterate over them
    }
}

    class States{
        public static void main(String[] args) {

        Set<String> states = new HashSet<>();
        states.add("FL");
        states.add("FL");
        states.add("PA");
        states.add("PA");
        states.add("NY");
        states.add("NY");
        states.add("NC");
            System.out.println(states.addAll(Arrays.asList("GA","NY","FL","FL","VA","VA")));
            System.out.println("=============USING SET================");
        System.out.println("states = " + states);
        System.out.println("How many states.size() = " + states.size());
            System.out.println("=============USING FOR EACH================");
            for(String each: states){
                System.out.println("each = " + each);
            }
            System.out.println("=============USING ITERATOR================");
            Iterator<String> stIter = states.iterator();
            while(stIter.hasNext()){
                System.out.print("|  stIter = " + stIter.next());

            }
            System.out.println();
            System.out.println("=============USING LAMBDA================");
            states.forEach(each-> System.out.print(each+" "));
        
        
    }
}
