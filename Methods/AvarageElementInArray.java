
// Avarage Element In Array
// Author - Saravan

public class AvarageElementInArray {
    public static double findAverage(int[] arr) {
        if (arr == null || arr.length == 0) {
            System.out.println("no elements in array");
            return 0.0;
        }
        int sum = 0;
         for(int i =0;i<arr.length;i++){
            sum += arr[i];
        }
        double avg = (double) sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 5, 6};
        double result = findAverage(arr);
        System.out.println("Average : " + result);
    }
}
