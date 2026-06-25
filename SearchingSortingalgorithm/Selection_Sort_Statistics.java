package SearchingSortingalgorithm;

public class Selection_Sort_Statistics {

    public void selectionSort(int[] arr) {

        if (arr == null) {
            System.out.println("Array is null");
            return;
        }

        if (arr.length == 0) {
            System.out.println("Elements not found");
            return;
        }

        int comparisons = 0;
        int swaps = 0;

        for (int i = 0; i < arr.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < arr.length; j++) {
                comparisons++;

                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            if (i != min) {
                int temp = arr[i];
                arr[i] = arr[min];
                arr[min] = temp;
                swaps++;
            }

            System.out.println("\nPass " + (i + 1));
            System.out.println("Comparisons: " + comparisons);
            System.out.println("Swaps: " + swaps);

            System.out.print("Array: ");
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("\nFinal Statistics");
        System.out.println("Total Comparisons: " + comparisons);
        System.out.println("Total Swaps: " + swaps);
    }

    public static void main(String[] args) {

        int[] arr = {1, 3, 2, 43, 5};

        new Selection_Sort_Statistics().selectionSort(arr);

        System.out.println("\nArray after sorting");

        for (int num : arr) {
            System.out.println(num);
        }
    }
}