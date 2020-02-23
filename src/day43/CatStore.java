package day43;

public class CatStore {
    private String type;
   private  String name;


    public CatStore(){
        this.type="unknown";
        this.name="kotokBash";
        System.out.println("no args");
    }
    public CatStore(String newName, String newType){
        this.type = newType;
        this.name = newName;


    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String toString() {
        return "CatStore{" +
                "type='" + type + '\'' +
                ", name='" + name + '\'' +
                '}';
    }

    public void  speak(){
        if(type.equalsIgnoreCase("cat")){
            System.out.println("meow");
        }else if(type.equalsIgnoreCase("cow")){
            System.out.println("mooo");
        }else if(type.equalsIgnoreCase("horse")){
            System.out.println("neinei");
        }else if(type.equalsIgnoreCase("dog")){
            System.out.println("gaf");
        }else{
            System.out.println("UNKNOWN ANIMAL");

        }
    }
    public static void showGeneralInfo(){
        System.out.println("Pets are friends of humans");
    }
}
