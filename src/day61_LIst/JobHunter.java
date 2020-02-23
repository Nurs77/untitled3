package day61_LIst;

import java.util.*;

public class JobHunter {
    public static void main(String[] args) {
        List<String> Jobs = new LinkedList<>();
        Job j1 = new Job("Chicago", 120000, "Amazon");
        Job j2 = new Job("Florida", 140000,"EA SPORT");
        Job j3 = new Job("San Fracisco",130000,"Google");
        Job j4 = new Job("Philadelphia", 100000,"BankOFAmerica");
        Job j5 = new Job("New York",125000,"Microsoft");

        List<Job> jobList = new LinkedList<>();
        jobList.addAll(Arrays.asList(j1,j2,j3,j4,j5));
        System.out.println("before sorting \n \t" +jobList);
        Collections.sort(jobList);
        System.out.println("after sorting \n \t" +jobList);
        Collections.sort(jobList, Comparator.reverseOrder());
        System.out.println("reverse jobList = \n \t" + jobList);
    }
}
