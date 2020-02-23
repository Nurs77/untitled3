package officeHours.practice_02_06;



public abstract class States {
    public  void tax(){

    }
    public final void method1(){
        //!!!!!!!!!!!!===========Final Class CAN"T BE OVERRIDDEN==========!!!!!!!!!!!!!!!
        System.out.println("method one in super class");
    }

}
class Kentucky extends States{
    public void tax(){
        System.out.println("Tax in Kentucky is 6%");
    }
    public void KFC(){
        System.out.println("Kentucky is known for KFC");
    }
    public final void method1(int a){
        System.out.println("method1 in Kentucky");
    }
}

class California extends States{
    public void tax(){
        System.out.println("Tax in California is 9%");
    }
    public void hollywood(){
        System.out.println("California has Hollywood");
    }
}

