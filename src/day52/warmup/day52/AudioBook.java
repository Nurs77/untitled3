package day52.warmup.day52;

public class AudioBook extends Book {
double duration;
public AudioBook(String name, String author, double duration){
    super(name, author);
    this.duration = duration;
}

    @Override
    public void displayInfo() {
        System.out.println("Paper Book's name is : "+ name+ " and the author is: "+author+ " and duration is " + duration+ " minutes");
    }

    @Override
    public void takeNotes() {
        System.out.println("audiobook are fucking awesome");
    }

    @Override
    public String toString() {
        return "AudioBook{" +
                "duration=" + duration +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
