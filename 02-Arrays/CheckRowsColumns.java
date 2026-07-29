public class CheckRowsColumns {

	public static int calculateMatrixSum(int[][] matrix) {
		int sum = 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[i].length; j++) {
				sum += matrix[i][j];
			}
		}
		return sum;
	}

	public static void main(String[] args) {
		int[][] matrix = { {1,2}, {3,4}, {5,6} };
		int rows = matrix.length;
		int cols = matrix[0].length;
		System.out.println("Rows: " + rows);
		System.out.println("Columns: " + cols);
		System.out.println("Sum: " + calculateMatrixSum(matrix));
	}

}

