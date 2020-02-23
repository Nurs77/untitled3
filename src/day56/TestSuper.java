package day56;



public class TestSuper {

    private static TestSuper instance;

    private TestSuper(){
        System.out.println("No arg constructor being called!");

    }
    public static TestSuper getInstance(){
        if(instance ==null){
            return new TestSuper();

        }else{
            System.out.println("We already have this object");
        }
        return instance;

    }

}
