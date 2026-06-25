package SearchingSortingalgorithm;

public class BubbleSort_withcount {
    
    public void bubblesort(int[] arr){
        if(arr == null){
            System.out.println("array is null");
            return;
        }
        if(arr.length == 0){
            System.out.println("elements not found");
            return;
        }
        int comparisons = 0,swap =0;
        for(int i = 0;i < arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                comparisons++;
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    swap++;
                }
            }
        }
        System.out.println("the total comparisons is:"+ comparisons+ "  The total swaps is: " + swap);
        System.out.println("sorted array is ");
        for(int i =0 ; i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
 public static void main(String[] args) {
    int[] arr = {5,4,3,2,1};
    new BubbleSort_withcount().bubblesort(arr);
 }
}



