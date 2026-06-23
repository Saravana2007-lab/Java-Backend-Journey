public class searchelementinmatrix {
    public static boolean searchMatrix(int[][] matrix, int target){
        if(matrix == null || matrix.length == 0){
            System.err.println("no elements found");
            return false;
        }
        for(int i =0;i<matrix.length;i++){
            for(int j =0;j<matrix.length;j++){
                if(target == matrix[i][j]){
                    System.out.println("element found");
                return true;
                }
            }
        }
         System.out.println("element not found");
        return false;
       
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        boolean result = searchMatrix(matrix, 3);
        System.out.println(result);
    }
}
