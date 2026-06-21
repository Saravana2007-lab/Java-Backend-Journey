// Sum of array using methods
// Author - Saravana



public class Sumofarrayusingmethods {
    public int sum(int[] arr) {
        int total = 0;
        if (arr == null) return 0;
        for (int v : arr) {
            total += v;
        }
        return total;
    }

    public static void main(String[] args) {
        int[] sample = {1, 2, 3, 4, 5};
        Sumofarrayusingmethods s = new Sumofarrayusingmethods();
        System.out.println("Sum = " + s.sum(sample));
    }

}