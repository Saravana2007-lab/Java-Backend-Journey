package Collections.Queue;

import java.util.LinkedList;
import java.util.Queue;
 class Process{

 private int processId;
private String processName;
Process(int processId,String processName){
    this.processId =processId;
    this.processName= processName;
}
@Override
public String toString(){
    return "Process ID: " + processId + "\n" + "Process Name: " + processName;
}
}
class Scheduler {
Queue<Process> readyQueue = new LinkedList<>();

void addProcess(Process process){
        readyQueue.offer(process);
    System.out.println("Process added succefully "+ process);
}
void executeProcess(){
    if(readyQueue.isEmpty()){
        System.out.println("No process available.");
    }
    else{
        System.out.println("Executing...");
       System.out.println(readyQueue.poll().toString()); 
    }
}
void showProcesses(){ 
    if(readyQueue.isEmpty()){
        System.out.println("All the process done.");
    }
    else{
        for(Process p :readyQueue){
           System.out.println(p.toString()); 
            System.out.println("------------");
        }
    }
}
}
public class CPUProcessScheduler {
    public static void main(String[] args) {
     Process[] process = {new Process(101, "Chome"), new Process(102, "Spoify"), new Process(103, "youtube")};
      Scheduler schedul = new Scheduler();
        schedul.addProcess(process[0]);
        schedul.addProcess(process[1]);
        schedul.showProcesses();
        schedul.executeProcess();
        schedul.executeProcess();
        schedul.executeProcess();
        
    }
}
