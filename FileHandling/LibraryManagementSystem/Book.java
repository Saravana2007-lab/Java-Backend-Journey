package FileHandling.LibraryManagementSystem;

public class Book {
    private String bookId;
    private String title;
    private String author;
    private String category;
    private boolean status;

Book(){}
    public Book(String bookId, String title, String author, String category, boolean status) {
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.category = category;
        this.status = status;
    }

    public String getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getCategory() {
        return category;
    }

    public boolean getStatus() {
        return status;
    }
    public void setStatus(boolean status){
        this.status = status;
    }
     public String getBook() {
        return bookId+","+title+","+author+","+category+","+status;
     }
}
