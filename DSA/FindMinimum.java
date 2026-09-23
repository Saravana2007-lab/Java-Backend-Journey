class MinimumFinder {
    int findmin(int arr[]) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {  
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}
public class FindMinimum {
    public static void main(String[] args) {
        MinimumFinder m = new MinimumFinder();
        int arr[] = {7, 5, 43, 3, 22};
        int minimum = m.findmin(arr);
        System.out.println("The minimum value in the arr is: " + minimum);
    }
}
