package Projects;

interface Borrowable {
    void borrow();
    void returnItem();
    boolean isAvailable();
}

abstract class LibraryItem implements Borrowable {
    String title;
    String id;
    boolean available = true;
    
    LibraryItem(String title, String id) {
        this.title = title;
        this.id = id;
    }

    @Override
    public void borrow() {
        if (available) {
            System.out.println(title + " borrowed successfully");
            available = false;
        } else {
            System.out.println(title + " is already borrowed");
        }
    }

    @Override
    public void returnItem() {
        if (!available) {
            System.out.println(title + " returned successfully");
            available = true;
        } else {
            System.out.println(title + " is already available");
        }
    }

    @Override
    public boolean isAvailable() {
        return available;
    }
}

class Book extends LibraryItem {
    Book(String title, String id) {
        super(title, id);
    }
}

class Magazine extends LibraryItem {
    Magazine(String title, String id) {
        super(title, id);
    }
}

class ResearchPaper extends LibraryItem {
    ResearchPaper(String title, String id) {
        super(title, id);
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Borrowable[] li = {
            new Book("Techo", "c101"),
            new Magazine("NoteBook", "d102"),
            new ResearchPaper("How is Saravana so smart", "e302")
        };

        for (Borrowable l : li) {
            l.borrow();
            l.returnItem();
            System.out.println("Available? " + l.isAvailable());
            System.out.println("----------------------");
        }
    }
}
