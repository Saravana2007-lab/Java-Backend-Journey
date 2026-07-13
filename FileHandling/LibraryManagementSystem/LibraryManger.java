package FileHandling.LibraryManagementSystem;
import FileHandling.LibraryManagementSystem.Book;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Scanner;

public class LibraryManger {
    Scanner sc = new Scanner(System.in);
    public void create(){
         try {
            File file = new File("library.txt");
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
public void add() {
    try {
       
        BufferedReader br = new BufferedReader(new FileReader("library.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("library.txt", true)); 

        System.out.println("Enter the book ID:");
        String ID = sc.nextLine();

        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[0].equals(ID)) {
                System.out.println("Already another book with same ID.");
                br.close();
                bw.close();
                return;
            }
        }
         br.close();
        System.out.println("Enter the title:");
        String title = sc.nextLine();
        System.out.println("Enter the author:");
        String author = sc.nextLine();
        System.out.println("Enter the category:");
        String category = sc.nextLine();
        
        boolean status = true;

        Book book = new Book(ID, title, author, category, status);

        bw.write(book.getBookId() + "," + book.getTitle() + "," + book.getAuthor() + "," +
                 book.getCategory() + "," + book.getStatus());
        bw.newLine();

        System.out.println("Book added successfully");

       
        bw.close();
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
public void viewBooks(){
    try{
        BufferedReader br = new BufferedReader(new FileReader("library.txt"));
        String line;
        System.out.println("-----------------------");
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length >= 5) {
                System.out.println("Book ID   : " + data[0]);
                System.out.println("Title     : " + data[1]);
                System.out.println("Author    : " + data[2]);
                System.out.println("Category  : " + data[3]);
                System.out.println("Available : " + data[4]);
            } 
            System.out.println("----------------------");
        }
       
        br.close();
    }
    catch(IOException e){
        System.out.println("Error: " + e.getMessage());
    }
}
public void searchBook() {
    try {
        BufferedReader br = new BufferedReader(new FileReader("library.txt"));
        System.out.println("Enter the book ID:");
        String ID = sc.nextLine();
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[0].equals(ID)) {
                Book book = new Book(data[0], data[1], data[2], data[3],  Boolean.parseBoolean(data[4]));

                System.out.println("Book Found: " + book.getBook());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No book found with ID " + ID);
        }

        br.close();
    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}
public void borrowBook() {
    try {
        
        File inputFile = new File("library.txt");
        File tempFile = new File("library_temp.txt");

        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        BufferedWriter bw = new BufferedWriter(new FileWriter(tempFile));

        System.out.println("Enter the book ID:");
        String ID = sc.nextLine();
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[0].equals(ID)) {
                boolean currentStatus = true;
                try {
                    currentStatus = Boolean.parseBoolean(data[4]);
                } catch (Exception ex) {
                    currentStatus = true;
                }

                if (!currentStatus) {
                    System.out.println("Book is already borrowed.");
                    found = true;
                } else {
                    Book book = new Book(data[0], data[1], data[2], data[3], false);
                    line = book.getBookId() + "," + book.getTitle() + "," + book.getAuthor() + "," +
                           book.getCategory() + "," + book.getStatus();
                    System.out.println("Book Found: " + book.getTitle() + " borrowed successfully!");
                    found = true;

                    long start = System.currentTimeMillis();
                    int duration = 10;
                    while (System.currentTimeMillis() - start < duration * 1000) {
                        long remaining = duration - ((System.currentTimeMillis() - start) / 1000);
                        System.out.print("\rTime left to return: " + remaining + " seconds");
                    }
                    System.out.println("\nBorrow time finished! Book is now due.");
                }
            }
            bw.write(line);
            bw.newLine();
        }

        br.close();
        bw.close();

        if (!found) {
            System.out.println("No book found with ID " + ID);
        }

        inputFile.delete();
        tempFile.renameTo(inputFile);

    } catch (IOException e) {
        System.out.println("Error: " + e.getMessage());
    }
}

public void returnbook(){
     try {

        BufferedReader br = new BufferedReader(new FileReader("library.txt"));
        System.out.println("Enter the book ID:");
        String ID = sc.nextLine();
        String line;
        boolean found = false;

        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data[0].equals(ID)) {
                Book book = new Book(data[0], data[1], data[2], data[3], true);

                System.out.println("Book Found: " + book.getBook());
                 book.setStatus(true);
                found = true;}
            }
}
catch(IOException e){
    System.out.println("Error   "+ e.getMessage());
}
}
}

