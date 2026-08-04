package Collections.Set;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.concurrent.TransferQueue;

class Transaction {
    String id;
    String name;

    Transaction(String id, String name) {
        this.id = id;
        this.name = name;
    }
void setId(String id){
this.id = id;
}
void setname(String name){
this.name = name;
}
    @Override
    public String toString() {
        return "Name : " + name +
               "\nId : " + id;
    }
}

public class UniqueTransactionHistory {
    public static void main(String[] args) {
        LinkedHashSet<Transaction> set = new LinkedHashSet<>();
        Scanner sc = new Scanner(System.in);
        int count = 0;
        System.out.print("Enter number of transactions: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        for (int i = 0; i < n; i++) {
            System.out.print("Enter Transaction ID: ");
            String id = sc.nextLine();

            System.out.print("Enter Transaction Name: ");
            String name = sc.nextLine();
            for(Transaction t: set){
            if(t.id.contains(id)){
                count ++;
            }
        }

            set.add(new Transaction(id, name));
        }
System.out.println("duplicate requests were ignored "+ count);
System.out.println("The transaction without the dupilicates");
    }
}
