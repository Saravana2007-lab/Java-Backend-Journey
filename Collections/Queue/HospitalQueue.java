package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;

class Patient{
    String name;
    String patientid;
    Patient(String name,String patientid){
        this.name = name;
        this.patientid = patientid;
    }
    @Override
public String toString(){
    return "Patient{name='" + name + "', patientId='" + patientid + "'}";
}
}
class manager{
    Queue<Patient> patientQueue =new LinkedList<>();

    void add(Patient p){
        patientQueue.offer(p);
        System.out.println("Patient added: "+ p);
    }
    void servePatient(){
        if(!patientQueue.isEmpty()){   
            System.out.println("Served: ");
            System.out.println(patientQueue.poll().toString());
        }
        else{
            System.out.println("all the patient served");
        }
    }
    void showQueue(){
        for(Patient p : patientQueue){
            System.out.println(p);
        }
    }
}
public class HospitalQueue {
public static void main(String[] args) {
    manager man = new manager();
    Patient[] p ={
        new Patient("Saravana", "S101"),
        new Patient("Aaron", "S102"),

    };
    man.add(p[0]);
    man.add(p[1]);
    man.showQueue();
    man.servePatient();
    man.servePatient();
    man.servePatient();

}
}
