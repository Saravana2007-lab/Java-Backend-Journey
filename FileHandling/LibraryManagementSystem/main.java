package FileHandling.LibraryManagementSystem;
import FileHandling.LibraryManagementSystem.Book;
import FileHandling.LibraryManagementSystem.LibraryManger;
import java.util.Scanner;
public class main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LibraryManger lb = new LibraryManger();
        lb.create();
        System.out.println("===========Menu============");
        do{
            System.out.println("What do you want to do \n"+ "\r 1.Add Book\n"+"\r2.View Books\n"+"\r3.Borrow Books\n"+"\r4.Return Books\n"+"\r5.Exit");
            int a = sc.nextInt();
            switch (a) {
                case 1 : lb.add();
                             break;
                case 2: lb.viewBooks();
                            break;
                case 3: lb.borrowBook();
                            break;
                case 4: lb.returnbook();
                            break;
                        
                case 5: return;
                default: System.out.println("Enter from the menu");
                    break;
            }
        }while(true);
    }
}
