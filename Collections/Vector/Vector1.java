package Collections.Vector;
import java.util.Vector;
import java.util.Scanner;
public class Vector1 {
 public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Vector<Integer> vc = new Vector<>();
    System.out.println("Enter how many elements you want to enter");
    int a = sc.nextInt();
System.out.println("Enter the elements");
    for(int i =0;i < a ;i++){
    int ele = sc.nextInt();
    vc.add(ele);
    }
System.out.println("All the elemets are added");  
if (vc.size() >= 2) {
    vc.add(2, 25);
}

for (int i = 0; i < vc.size(); i++) {
    if (vc.get(i) == 40) {
        vc.set(i, 45);
    }
}
 
if (vc.contains(30)) {
    System.out.println("Element 30 found");
} else {
    System.out.println("Element not found");
}
 
 
System.out.println("The first element is" + vc.get(0));
System.out.println("The last element is" + vc.get(vc.size()-1));
System.out.println("---------------------");
    System.out.println("Final Vector: " + vc);
}   
}
