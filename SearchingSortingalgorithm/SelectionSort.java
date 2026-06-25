package SearchingSortingalgorithm;

public class SelectionSort {
    public void selectionSort(int[] arr){
        if(arr == null){
            System.out.println("array is null");
            return;
        }
        if(arr.length == 0){
            System.out.println("elements not found");
            return;
        }
       for(int i = 0; i < arr.length; i++) {
    int min = i;

    for(int j = i + 1; j < arr.length; j++) {
        if(arr[j] < arr[min]) {
            min = j;
        }
    }

    int temp = arr[i];
    arr[i] = arr[min];
    arr[min] = temp;
}
        
    }
     public static void main(String[] args) {
    int[] arr = {1,3,2,43,5};
    new SelectionSort().selectionSort(arr);
    for(int i =0;i<arr.length;i++){
        System.out.println(arr[i]);
    }
 }
    
}
