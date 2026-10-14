
public class second_largest_element { public static void main(String[] args) {
        int[] a = {3, 4, 5, 6, 7};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        boolean hasLargest = false;
        boolean hasSecondLargest = false;

        for (int i = 0; i < a.length; i++) {
            if (!hasLargest || a[i] > largest) {
                if (hasLargest) {
                    secondLargest = largest;
                    hasSecondLargest = true;
                }
                largest = a[i];
                hasLargest = true;
            } else if (a[i] < largest && (!hasSecondLargest || a[i] > secondLargest)) {
                secondLargest = a[i];
                hasSecondLargest = true;
            }
        }
        if (hasSecondLargest) {
            System.out.println("Second largest = " + secondLargest);
        } else {
            System.out.println("No second largest distinct element");
        }
    }
}
