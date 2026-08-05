package Collections.Set;
import java.util.LinkedHashSet;

class Transaction {
    String id;
    String name;

    Transaction(String id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name : " + name + ", Id : " + id;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println("equals() called: comparing " + this + " with " + obj);

        if (this == obj) {
            System.out.println(" -> Same reference (this == obj)");
            return true;
        }
        if (!(obj instanceof Transaction)) {
            System.out.println(" -> Not a Transaction object");
            return false;
        }
        Transaction t = (Transaction) obj;
        boolean result = id.equals(t.id) && name.equals(t.name);
        System.out.println(" -> Field comparison result: " + result);
        return result;
    }

    @Override
    public int hashCode() {
        int hash = id.hashCode() + name.hashCode();
        System.out.println("hashCode() called for " + this + " -> " + hash);
        return hash;
    }
}

public class UniqueTransactionHistory {
    public static void main(String[] args) {
        Transaction t1 = new Transaction("T001", "Payment");
        Transaction t2 = new Transaction("T001", "Payment"); // duplicate of t1
        Transaction t3 = new Transaction("T002", "Refund");

        LinkedHashSet<Transaction> set = new LinkedHashSet<>();

        System.out.println("\nAdding t1...");
        set.add(t1);

        System.out.println("\nAdding t2...");
        set.add(t2);

        System.out.println("\nAdding t3...");
        set.add(t3);

        System.out.println("\nFinal Set Contents:");
        for (Transaction t : set) {
            System.out.println(t);
        }
    }
}
