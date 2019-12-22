package officeHours;

public class practice_12_11 {
    public static void main(String[] args) {
        //Finding "e" and printing it out from the array string

        String[] fruits = {"apple","banana","grape"};
        for (int i = 0; i <fruits.length ; i++) {
            String str=fruits[i];

            // if(str.ednsWith("e")){
            //system.out.println(str);

            if(!str.endsWith("e")){//and also .contains("e") and .charAt could be used in this case
                continue;
            }

            System.out.println(str);


        }
        System.out.println("=======");

    }

}
