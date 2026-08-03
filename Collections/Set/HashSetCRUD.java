package Collections.Set;
import java.util.Scanner;
import java.util.HashSet;

public class HashSetCRUD {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
while(true){
    System.out.println("Enter the number 1-7\r\n"+"1. Add Element\r\n" + //
                "2. Remove Element\r\n" + //
                "3. Search Element\r\n" + //
                "4. Display Elements\r\n" + //
                "5. Size\r\n" + //
                "6. Clear Set\r\n" + //
                "7. Exit");
    int choice = sc.nextInt();
    switch(choice){
        case 1: System.out.println("Enter the number you want to insert");
                int insert = sc.nextInt();
                set.add(insert);
                break;
        case 2: System.out.println("Enter the number you want to remove");
                int remove = sc.nextInt();
                set.remove(remove);
                break;
        case 3: System.out.println("Enter the number you want to search");
                int serach = sc.nextInt();
                if(set.contains(serach)){
                    System.out.println("element found");
                }
                else{
                    System.out.println("Element not found");
                }
                break;
        case 4:System.out.println("Enter the number in the set is:");
                for(Integer s : set){
                    System.out.println(s);
                }
                break;
        case 5:System.out.println(" the size is "+ set.size());break;
        case 6:set.clear();
                System.out.println("The set is cleared");
                break;
        case 7: return;
        default : System.out.println("Press number from 1 too 7");
                
    }
}
    }
    
}
