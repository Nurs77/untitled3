package day26;

import java.util.Arrays;

public class CountItemInAnArray {
    public static void main(String[] args) {
        String[] marvelHeroes = {"Iron Man", "CaptainAmerica", " SpiderMan","Iron Man","Black Panther", "CaptainAmerica","Hulk","Black Wanda","Captain Marvel","Wanda"};
        System.out.println("Marvel Heroes = " + Arrays.toString(marvelHeroes));

       int sizeOfArray = marvelHeroes.length;
        System.out.println("Hero Count = " + sizeOfArray);
        String itemToSearch = "Iron Man";
        int countOfItem = 0;
        for (String eachHero:marvelHeroes) {

            if(eachHero.equals(itemToSearch)){
                countOfItem++;
                
            }
        }
        System.out.println("countOfItem = " + countOfItem);

        // COUNT THE HERO WITH THE NAME CONTAINS BLACK IN CASE INSENTIVE MANNER
        int cntBlackInName = 0;
        for(String eachHero:marvelHeroes){
            if(eachHero.toLowerCase().contains("black")){
                cntBlackInName++;
            }
        }
        System.out.println("cntBlackInName = " + cntBlackInName);
    }
}
