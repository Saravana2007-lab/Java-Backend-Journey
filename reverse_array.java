import java.util.ArrayList;
public class reverse_array {
    public static void main(String[] args){
        int[] arr = {10,20,30,40,50};
        ArrayList<Integer> rev = new ArrayList<>();
        for(int i = arr.length-1; i>=0;i--){
            rev.add(arr[i]);
        }
        System.out.println(rev);
    }
}