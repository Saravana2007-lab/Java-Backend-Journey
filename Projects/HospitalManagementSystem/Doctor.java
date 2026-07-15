package Projects.HospitalManagementSystem;

public class Doctor {
    private String doctorId;
    private String name;
    private String specialization;
    private double experience;

    Doctor(String doctorId, String name, String specialization, double experience) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.experience = experience;
    }

    String getId() {
        return doctorId;
    }

    String getName() {
        return name;
    }

    String getSpecialization() {
        return specialization;
    }

    double getExperience() {
        return experience;
    }

    void displayDoctorInfo() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Experience: " + experience + " years");
    }
}
