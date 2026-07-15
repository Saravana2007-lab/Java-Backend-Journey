package Projects.HospitalManagementSystem;
import java.util.List;
import java.util.ArrayList;
import Projects.HospitalManagementSystem.*;

public class HospitalManager {
List<Patient> patients = new ArrayList<>();
List<Doctor> doctors = new ArrayList<>();
void findpatients(String patientId){
for(Patient p : patients){
    if((p.getId()).equals(patientId)){
        System.out.println("Found");
        p.displayPatientInfo();
        return;
    }
}
System.out.println("Patient not found ");
}
void addPatient(Patient newPatient) {
    for (Patient p : patients) {
        if (p.getId().equals(newPatient.getId())) {
            System.out.println("Patient ID already exists. Try another ID.");
           
            return;
        }
    }
    patients.add(newPatient);
    System.out.println("Patient added successfully.");
}

void displayPatient(){
    System.out.println("The Patient That are in hospital is ");
    for(Patient p : patients){
        p.displayPatientInfo();
        System.out.println("-----------------");
    }
}
void updatedisease(String patientId,String Disease){
for(Patient p : patients){
    if((p.getId()).equals(patientId)){
      p.setDisease(Disease);
      p.displayPatientInfo();
    }
}
System.out.println("Patient not found ");
}
void Discharge(String patientId){
for(Patient p : patients){
    if((p.getId()).equals(patientId)){
        System.out.println("Found");
        patients.remove(p);
        System.out.println("Patient removed");
        return;
    }
}
System.out.println("Patient not found ");
}

void AddDoctor(Doctor newDoctor) {
    for (Doctor d : doctors) {
        if (d.getId().equals(newDoctor.getId())) {
            System.out.println("ID has been taken");
            return;
        }
    }
    doctors.add(newDoctor);
    System.out.println("Added successfully");
}
void DisplayDoctors(){
       for (Doctor d : doctors) {
            d.displayDoctorInfo();
            System.out.println("-----------------------");
        }
    } 
void finddoc(String doctorid){
for(Doctor d : doctors){
    if((d.getId()).equals(doctorid)){
        System.out.println("Found");
        d.displayDoctorInfo();
        return;
    }
}
System.out.println("doctor not found ");
}
void removedoc(String doctorid){
    for(Doctor d : doctors){
    if((d.getId()).equals(doctorid)){
        doctors.remove(d);
        System.out.println("doc removed");
        
        return;
    }
}
System.out.println("doctor not found ");
}
void adddoc(Doctor doc) {
    for (Doctor p : doctors) {
        if (p.getId().equals(doc.getId())) {
            System.out.println("Patient ID already exists. Try another ID.");
           
            return;
        }
    }
    patients.add(newPatient);
    System.out.println("Patient added successfully.");
}
}
    
