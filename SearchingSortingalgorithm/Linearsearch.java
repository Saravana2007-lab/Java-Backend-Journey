// Linear Search Using Method
// Author - Saravana
package SearchingSortingalgorithm;

public class Linearsearch{
    public static int linearSearch(int[] arr, int target){
        
        for(int i = 0; i < arr.length; i++){
            if(target == arr[i]){
                
                System.out.println("Element found at index " + i);
                return i;
            }
        }
        
        System.out.println("Element not found");
        return -1;
        
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,8,7};
        Linearsearch ln = new Linearsearch();
        int result = ln.linearSearch(arr, 5);
        System.out.println(result);
    }
}