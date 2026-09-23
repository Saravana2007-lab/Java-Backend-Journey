public class CheckSortedArray {
 public static void main(String[] args) {
        int[] arr = {1,2,3,2,8,10};

        for(int i=0; i < arr.length -1 ; i++){
            if(arr[i] > arr[i+1]){
                System.out.println("The array is sorted");
                return;
            }
        }
        System.out.println("The array is sorted");
     
    }
}
