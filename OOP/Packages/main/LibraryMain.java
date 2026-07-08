package Packages.main;

import Packages.model.Book;

public class LibraryMain {
    public static void main(String[] args) {
        Book b = new Book("Long notebook", "Saravana", 154.67);
        b.display();
    }
}
