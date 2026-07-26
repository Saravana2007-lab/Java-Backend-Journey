package Collections.Vector;

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vc =new Vector<>();
        vc.add(101);
        vc.add(102);
        vc.add(103);
        vc.remove(2);
        for(Integer v : vc){
            System.out.println(v);
        }
   
    }
}
