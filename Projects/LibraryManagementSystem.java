package Projects;

interface Borrowable {
void borrow();

void returnItem();

boolean isAvailable();  
}
abstract class LibraryItem{
String title;
String id;
boolean Availabe = true;
LibraryItem(String title, String id){
    this.title = title;
    this.id=id;
}
}
class Book extends LibraryItem implements Borrowable  {

    Book(String title, String id) {
        super(title, id);
    }
     @Override
public void borrow(){
    if(Availabe == true){
        System.out.println("Borrow Successful");
        Availabe = false;
    }
    else{
        System.out.println("Already Borrowed");
  
    }
}
@Override
public void returnItem(){
    if(Availabe == false){
        System.out.println("Returned Successfully");
        Availabe = true;
    }
    else{
        System.err.println("Item already availablex");
    }
}
@Override
public boolean isAvailable(){
return Availabe;
}
}

class Magazine extends LibraryItem implements Borrowable{
        Magazine(String title, String id) {
        super(title, id);
    }

    @Override
    public void borrow() {
        if (Availabe == true) {
            System.out.println("Magazine borrowed");
            Availabe = false;
        } else {
            System.out.println("Already borrowed");
        }
    }

    @Override
    public void returnItem() {
        if (!Availabe) {
            System.out.println("Magazine returned");
            Availabe = true;
        } else {
            System.out.println("Already available");
        }
    }

    @Override
    public boolean isAvailable() {
        return Availabe;
    }
}


class ResearchPaper extends LibraryItem implements Borrowable{
     ResearchPaper(String title, String id) {
        super(title, id);
    }

    @Override
    public void borrow() {
        if (Availabe == true) {
            System.out.println("ResearchPaper borrowed");
            Availabe = false;
        } else {
            System.out.println("Already borrowed");
        }
    }

    @Override
    public void returnItem() {
        if (!Availabe) {
            System.out.println("ResearchPaper returned");
            Availabe = true;
        } else {
            System.out.println("Already available");
        }
    }

    @Override
    public boolean isAvailable() {
        return Availabe;
    }

}


public class LibraryManagementSystem {
    public static void main(String[] args) {
        Borrowable[] li = {
            new Book("Techo","c101"),
            new Magazine("NoteBook", "d102"),
            new ResearchPaper("How is Saravana so smart","e302" )
            
        };

        for(Borrowable l : li){
            l.borrow();
            l.returnItem();
            l.isAvailable();
            System.out.println("------------------------------");
        }
    }
    
}
