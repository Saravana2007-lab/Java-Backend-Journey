package SearchingSortingalgorithm;

public class RadixSort {
    
    static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
    
    static void countingSort(int[] arr, int exp) {
        int n = arr.length;
        int[] output = new int[n];
        int[] count = new int[10]; // For digits 0-9
        
        for (int i = 0; i < n; i++) {
            count[(arr[i] / exp) % 10]++;
        }
        
        for (int i = 1; i < 10; i++) {
            count[i] += count[i - 1];
        }
        
        for (int i = n - 1; i >= 0; i--) {
            int digit = (arr[i] / exp) % 10;
            output[count[digit] - 1] = arr[i];
            count[digit]--;
        }
        
        for (int i = 0; i < n; i++) {
            arr[i] = output[i];
        }
    }
    
    static void radixSort(int[] arr) {
        if (arr.length == 0) {
            return;
        }
        
        int max = getMax(arr);
        
        for (int exp = 1; max / exp > 0; exp *= 10) {
            countingSort(arr, exp);
        }
    }
    
    static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        int[] arr = {170, 45, 75, 90, 2, 802, 24, 2, 66};
        
        System.out.println("Original array:");
        printArray(arr);
        
        radixSort(arr);
        
        System.out.println("Sorted array using Radix Sort:");
        printArray(arr);
        
        int[] arr2 = {121, 432, 564, 23, 1, 45, 788};
        System.out.println("\nOriginal array 2:");
        printArray(arr2);
        
        radixSort(arr2);
        System.out.println("Sorted array 2 using Radix Sort:");
        printArray(arr2);
    }
}
