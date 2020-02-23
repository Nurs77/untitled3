package day43;

public class CatStatic {
    public static void main(String[] args) {
        //String str = String.valueOf(10);

        CatStore.showGeneralInfo();
        CatStore p1 = new CatStore("yumyum", "cat");
        System.out.println("p1.getName() = " + p1.getName());
        p1.speak();


    }
}
