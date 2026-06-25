package SearchingSortingalgorithm;
// Binary Search Using Method
// Author - Saravana

public class BinarySearchUsingMethod {
    
    public static int binarySearch(int[] arr, int target) {
     
        if (arr == null) {
            System.out.println("Array is null");
            return -1;
        }
        
     
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        
        int low = 0;
        int high = arr.length - 1;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        
        return -1;
    }
    
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        
        int result = binarySearch(arr, target);
        
        if (result != -1) {
            System.out.println("Found at index " + result);
        } else {
            System.out.println("Not Found");
        }
    }
}

