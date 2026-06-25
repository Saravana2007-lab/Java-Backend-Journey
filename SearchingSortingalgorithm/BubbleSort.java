package SearchingSortingalgorithm;

public class BubbleSort {
    public void bubblesort(int[] arr){
        if(arr == null){
            System.out.println("array is null");
            return;
        }
        if(arr.length == 0){
            System.out.println("elements not found");
            return;
        }
        for(int i = 0;i < arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println("sorted array is ");
        for(int i =0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
 public static void main(String[] args) {
    int[] arr = {1,3,2,43,5};
    new BubbleSort().bubblesort(arr);
 }
}

