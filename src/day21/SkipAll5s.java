package day21;

public class SkipAll5s {
    public static void main(String[] args) {
        //count 1 to 100
        //skip all the numbers divisible by 5
        //x%5==0
        for (int x = 1; x <=100 ; x++) {
            if(x%5==0){
                System.out.println("Skipping " + x);
                continue;

            }
            System.out.println(x);
        }
        System.out.println("=======");
        //SKIPPING ALL NUMBERS THAT DON"T DiVIDE TO 5
        for (int i = 1; i <=100 ; i++) {
            if(i%5!=0){

                System.out.println("SKIPPING "+ i);
                continue;
            }
            System.out.println(i);
        }
    }
}
