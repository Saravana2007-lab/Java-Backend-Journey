
public class second_largest_element { public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7};

        int largest = a[0];
        int secondLargest = a[0];

        // Find largest
        for (int i = 0; i < a.length; i++) {
            if (a[i] > largest) {
                largest = a[i];
            }
        }

        // Find second largest
        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondLargest && a[i] < largest) {
                secondLargest = a[i];
            }
        }

        System.out.println("Second largest = " + secondLargest);
    }
}
