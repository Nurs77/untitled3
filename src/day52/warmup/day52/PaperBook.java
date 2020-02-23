package day52.warmup.day52;

public class PaperBook extends Book implements Readable{
    int weight;
    public PaperBook(String name, String author, int weight) {
        super(name, author);
        this.weight = weight;

    }

    @Override
    public void displayInfo() {
        System.out.println("Paper Book's name is : "+ name+ " and the author is: "+author+ " and it weight " + weight+ " pound");
    }

    @Override
    public void takeNotes() {
        System.out.println("taking note from "+ name);
    }

    @Override
    public void read() {
        System.out.println("Reading this shit");
    }

    @Override
    public String toString() {
        return "PaperBook{" +
                "weight=" + weight +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
