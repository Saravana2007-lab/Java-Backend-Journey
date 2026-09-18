class max{
    int findmax(int arr[]){
        int max = arr[0];
     for (int i = 0; i <= arr.length - 1; i++) {
        if(arr[i] > max){
         max = arr[i];
            }
        }
        return max;
    }
}

public class FindMaximum {
    public static void main(String[] args) {
        
    max m = new max();
    int[] arr = {23,54,23,56,43};
    int Max = m.findmax(arr);
    System.out.println("The max value in the array is: "+ Max);
    
    }
}
