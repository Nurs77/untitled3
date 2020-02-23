package day62_SetInterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetOfUniqueStates_Deleting {
    public static void main(String[] args) {
        Set<String> states = new HashSet<>();
        System.out.println(states.addAll(Arrays.asList("GA","NY","FL","FL","VA","VA")));
        states.remove("GA");
       System.out.println("states = " + states);
//=========== REMOVING ALL STATES THAT CONTAIN "A" ===============
        Iterator<String> stIter = states.iterator();
        while (stIter.hasNext()){
            String each = stIter.next();
            if(each.contains("A")){
                System.out.println("removing = " + each);
                stIter.remove();
            }
            //System.out.println("stIter.next() = " + stIter.next());
        }
        System.out.println("states after removing = "+states);
        
        
    }
}
