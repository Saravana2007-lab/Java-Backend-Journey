package Projects.HospitalManagementSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HospitalManager hospital = new HospitalManager();

        
        Patient p1 = new Patient("P001", "John Doe", 30, "Male", "Flu", "D001");
        Patient p2 = new Patient("P002", "Jane Smith", 25, "Female", "Cold", "D002");
        Doctor d1 = new Doctor("D001", "Dr. Brown", "Cardiology", 12.5);
        Doctor d2 = new Doctor("D002", "Dr. Green", "Neurology", 8.0);

        hospital.patients.add(p1);
        hospital.patients.add(p2);
        hospital.AddDoctor(d1);
        hospital.AddDoctor(d2);

      
        while (true) {
            System.out.println("----------- Menu ----------");
            System.out.println("1. Display All Patients");
            System.out.println("2. Find Patient");
            System.out.println("3. Update Patient Disease");
            System.out.println("4. Discharge Patient");
            System.out.println("5. Display All Doctors");
            System.out.println("6. Find Doctor");
            System.out.println("7. Remove Doctor");
            System.out.println("8. Exit");
            System.out.println("9. Add Patient");
            System.out.println("10. Add doctor");
            System.out.print("Enter your choice: ");

            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    hospital.displayPatient();
                    break;

                case 2:
                    System.out.print("Enter Patient ID to find: ");
                    String findPid = sc.nextLine();
                    hospital.findpatients(findPid);
                    break;

                case 3:
                    System.out.print("Enter Patient ID to update disease: ");
                    String updateId = sc.nextLine();
                    System.out.print("Enter new Disease: ");
                    String newDisease = sc.nextLine();
                    hospital.updatedisease(updateId, newDisease);
                    break;

                case 4:
                    System.out.print("Enter Patient ID to discharge: ");
                    String dischargeId = sc.nextLine();
                    hospital.Discharge(dischargeId);
                    break;

                case 5:
                    hospital.DisplayDoctors();
                    break;

                case 6:
                    System.out.print("Enter Doctor ID to find: ");
                    String findDid = sc.nextLine();
                    hospital.finddoc(findDid);
                    break;

                case 7:
                    System.out.print("Enter Doctor ID to remove: ");
                    String removeDid = sc.nextLine();
                    hospital.removedoc(removeDid);
                    break;

                case 8:
                    System.out.println("Exiting program...");
                    sc.close();
                    return;
                
                case 9:
                        System.out.print("Enter Patient ID: ");
    String pid = sc.nextLine();
    System.out.print("Enter Name: ");
    String pname = sc.nextLine();
    System.out.print("Enter Age: ");
    int age = sc.nextInt();
    sc.nextLine(); 
    System.out.print("Enter Gender: ");
    String gender = sc.nextLine();
    System.out.print("Enter Disease: ");
    String disease = sc.nextLine();
    System.out.print("Enter Doctor Assigned: ");
    String doctorAssigned = sc.nextLine();

    
    Patient newPatient = new Patient(pid, pname, age, gender, disease, doctorAssigned);

    
    hospital.addPatient(newPatient);
    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
