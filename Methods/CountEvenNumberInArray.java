public class CountEvenNumberInArray {
	public static int countEven(int[] arr) {
		if (arr == null || arr.length == 0) return 0;
		int count = 0;
		for (int v : arr) {
			if (v % 2 == 0) count++;
		}
		return count;
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6};
		int result = countEven(arr);
		System.out.println("Even count : " + result);
	}

}
