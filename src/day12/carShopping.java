package day12;

public class carShopping {
    public static void main(String[] args) {
        String carBrand = "corolla";
        int carPrice = 50000;
        int budget = 40000;

        if(carBrand.equals("corolla") | carBrand.equals("Tesla") && carPrice<= budget){
            System.out.println("BUy that car ");
        } else{
            System.out.println("NOt what I am looking for");
        }
    }
}
