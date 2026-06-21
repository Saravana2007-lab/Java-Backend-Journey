
// Largest Element Using Method
// Author - Saravana
public class largestelementinarr {
    public int findlar(int[] arr){
        
        int largest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] > largest){
                largest = arr[i];
            }
        }

return largest;
    }
    public static void main(String [] args){
        int[] a = {1,2,3,4};
        largestelementinarr s = new largestelementinarr();
        int result = s.findlar(a);
        System.out.println("Largest element = " + result);
    }
}
