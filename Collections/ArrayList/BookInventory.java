package Collections.ArrayList;
import java.util.ArrayList;
import java.util.List;
import Collections.ArrayList.Book;

public class BookInventory {
    public static void main(String[] args) {
        Book[] bk ={
            new Book("S101", "valo", "chamber", 110.03),
            new Book("S111", "valo", "yoru", 1140.03),
        };
    List<Book> book = new ArrayList<>();
    book.add(bk[0]);
    book.add(bk[1]);
       System.out.println("Before:  "+book.toString()); 
   System.out.println("total books: "+book.size()); 
   System.out.println("The first book is:   "+book.get(0));
   System.out.println("book removed:    "+book.remove(0));

   System.out.println("After:   "+book.toString());
}
}