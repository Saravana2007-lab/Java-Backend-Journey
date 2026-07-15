package Projects.HospitalManagementSystem;

public class Patient {
    private String patientId;
    private String name;
    private int age;
    private String gender;
    private String disease;
    private String doctorAssigned;

    Patient(String patientId, String name, int age, String gender, String disease, String doctorAssigned) {
        this.patientId = patientId;
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.disease = disease;
        this.doctorAssigned = doctorAssigned;
    }

    String getId() {
        return patientId;
    }

    String getName() {
        return name;
    }

    int getAge() {
        return age;
    }

    String getGender() {
        return gender;
    }

    String getDisease() {
        return disease;
    }
    void setDisease(String disease) {
    this.disease = disease;
}


    String getDoctorAssigned() {
        return doctorAssigned;
    }

    void displayPatientInfo() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
        System.out.println("Disease: " + disease);
        System.out.println("Doctor Assigned: " + doctorAssigned);
    }
}
