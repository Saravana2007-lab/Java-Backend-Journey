package Projects;


import java.util.Scanner;
import java.util.ArrayList;

class College {
    static Scanner sc = new Scanner(System.in);
    String name;
    int Age;
    int clgID;  
    static int totalPeople = 0;
    static String ClgName = "Ramiah";
    static ArrayList<College> TotalPeople = new ArrayList<>();

    College(String name, int Age, int clgID) {
        setName(name);
        setAge(Age);
        setID(clgID);
        totalPeople++;
        TotalPeople.add(this);
    }

    void setName(String name) {
        if (name.equals("")) {
            System.out.println("Enter the name again");
            return;
        }
        this.name = name.toLowerCase();
    }

    String getName() { return name; }

    void setID(int clgID) { this.clgID = clgID; }
    int getID() { return clgID; }

    void setAge(int Age) {
        if (Age < 0) {
            System.out.println("Invalid Age");
            return;
        }
        this.Age = Age;
    }
    int getAge() { return Age; }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + Age);
        System.out.println("ID: " + clgID);
        System.out.println("Total people: " + totalPeople);
    }
    static double calculateAverageAge(){
System.out.println("The avarage age for the "+ ClgName);

 double sum = 0;int count = 0;
    for (College person : TotalPeople) {
        sum += person.getAge();
        count++;
    }

    double avg = sum / count;
    System.out.println("Average Age: " + avg);
    return avg;
    }

    
    static void search() {
        System.out.println("Search by: 1.Name  2.ID  3.Index");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {
            case 1:
                System.out.println("Enter name:");
                String a = sc.nextLine().toLowerCase();
                for (College person : TotalPeople) {
                    if (a.equals(person.getName())) {
                        showDetails(person);
                        return;
                    }
                }
                System.out.println("Person not found");
                break;

            case 2:
                System.out.println("Enter ID:");
                int id = sc.nextInt();
                for (College person : TotalPeople) {
                    if (id == person.getID()) {
                        showDetails(person);
                        return;
                    }
                }
                System.out.println("Person not found");
                break;

            case 3:
                System.out.println("Enter index (0 to " + (TotalPeople.size() - 1) + "):");
                int idx = sc.nextInt();
                if (idx >= 0 && idx < TotalPeople.size()) {
                    showDetails(TotalPeople.get(idx));
                } else {
                    System.out.println("Invalid index");
                }
                break;

            default:
                System.out.println("Invalid choice");
        }
    }

    static void showDetails(College person) {
        System.out.println("Person found!");
        System.out.println("Press 1 for full details, 2 for just name");
        int b = sc.nextInt();
        sc.nextLine(); 

        if (b == 1) {
            person.display();
        } else if (b == 2) {
            System.out.println("Name: " + person.getName());
        } else {
            System.err.println("Enter a valid number");
        }
    }
}

class student extends College {
    int classroom;
    static int students = 0;

    student(int classroom, String name, int clgID, int Age) {
        super(name, Age, clgID);  
        this.classroom = classroom;
        students++;
    }


    void display() {
        super.display();
        System.out.println("Classroom: " + classroom);
        System.out.println("Students: " + students);
        System.out.println("--------------------------------------");
    }
}

class teacher extends College {
    int staffroom;
    static int teachers = 0;

    teacher(int staffroom, String name, int clgID, int Age) {
        super(name, Age, clgID);  
        this.staffroom = staffroom;
        teachers++;
    }


    void display() {
        super.display();
        System.out.println("Staffroom: " + staffroom);
        System.out.println("Teachers: " + teachers);
    }
}

public class CollegeManagementSystem {
    public static void main(String[] args) {
        student st = new student(2, "Saravana", 1203, 15);
        teacher th1 = new teacher(2, "Boovan", 1223, 19);

        College.search();
        College.calculateAverageAge();
    }
}
