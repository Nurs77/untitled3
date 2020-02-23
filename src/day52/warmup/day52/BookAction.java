package day52.warmup.day52;

import java.util.Arrays;
import java.util.List;

public class BookAction {
    public static void main(String[] args) {


        Book b1 = new PaperBook("Java", "Akbar", 3);
        Book b6 = new PaperBook("Kotok", "Nursultan", 10);
        b6.displayInfo();
        KnowledgeBank kb=b1;
        kb.takeNotes();
        kb.showTableofContent();
        System.out.println("---------------------");

        Book b2 = new PaperBook("Selenium", "Vasyl", 2);
        Book b3 = new AudioBook("Agile", "Guljannat", 1.8);

        Book b0 = new AudioBook("Agile", "Guljannat", 1.8);
        Book b9 = new AudioBook("Agile", "Guljannat", 1.8);
        Book b7 = new AudioBook("Agile", "Guljannat", 1.8);

List<Book> bookList = Arrays.asList(b7,b9,b0,b3,b2,b6,b1);
int count=0;
        for(Book eachBook: bookList ){
            if(eachBook.getClass().getSimpleName().equalsIgnoreCase("PaperBook")){
                count++;
            }

        }
        System.out.println("The count of PaperBooks are: "+count);
    }
}
