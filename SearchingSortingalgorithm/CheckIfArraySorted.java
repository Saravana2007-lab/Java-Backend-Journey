package SearchingSortingalgorithm;

public class CheckIfArraySorted {

    public static boolean isSortedAscending(int[] arr) {
        if (arr == null) {
            return false;
        }
        if (arr.length == 0) {
            return false;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5};
       

        printSortedCheck(arr1);
        
    }

    private static void printSortedCheck(int[] arr) {
        if (isSortedAscending(arr)) {
            System.out.println("Array already sorted");
        } else {
            System.out.println("Array not sorted");
        }
    }
}
