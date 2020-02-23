package day52.warmup.day52;

public interface KnowledgeBank {
    public abstract void takeNotes();
    public default void showTableofContent(){
        System.out.println("The book is very informative to learn");
    }
}
