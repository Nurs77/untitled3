package officeHours;

import java.util.Arrays;
import java.util.List;

public class practice_01_08v2 {
    public static void main(String[] args) {
        List<String> numLst = Arrays.asList("79" , "54" , "100", "65", "44","78","68","98" ,"89","77" );
        System.out.println("numLst = " + numLst);

       for(String each: numLst){
           int eachNum = Integer.parseInt(each);
           if(eachNum>60){
               System.out.println("pass= " +eachNum);
           }else{
               System.out.println("fail= " + eachNum);
           }


        }


        int count = 0;
        for (String each: numLst){
            if(Integer.parseInt(each)>90){
                ++count;
            }

        }
        System.out.println("count of numbers more than 90 is : "+count);

        int sum = 0;
        int average = 0;
        for (String each:numLst) {
            sum=sum + Integer.parseInt(each);


        }
        System.out.println("average= " +sum/numLst.size());

        numLst.set(0,numLst.get(0)+"C");

    }
}
