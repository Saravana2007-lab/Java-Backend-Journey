package Collections.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;
public class ArrayListBasics {
    public static void main(String[] args) {
    Scanner sc  = new Scanner(System.in);
    System.out.println("how many lang do want to enter");
    int a =sc.nextInt();
    sc.nextLine(); 
    ArrayList<String> lang = new ArrayList<>();
    String enter;
    for(int i =0;i<a;i++){
        System.out.println("enter one lang");
        enter = sc.nextLine();
        
        lang.add(enter);
    }
    System.out.println("Size of the list is "+lang.size());
System.out.println("The lang in 2nd index is" + lang.get(2));
lang.add(0,"C");
lang.set(0,"GO");
lang.add(1,"Rust");
lang.remove("JavaScript");

if (lang.contains("Python")) {
    System.out.println("Python found");
}

for(int i =0;i<lang.size();i++){
    System.out.println(lang.get(i));
}
}
}