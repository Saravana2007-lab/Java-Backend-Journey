// Matrix Average
// Author - Saravana

public class avarageelementinmatrix {
   public static double findMatrixAverage(int[][] matrix){
            if(matrix.length == 0){
            System.out.println("no elements found");
            return 0.0;
        }
      double avg = 0;
       int sum = 0;
        int count = 0;
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[i].length; j++){
                sum += matrix[i][j];
                count++;
            }
        }
         avg = (double)sum / count;
        System.out.println("the average is: " + avg);
        return avg;
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
    findMatrixAverage(matrix);        
    }
}
