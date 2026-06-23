// Column Sum of Matrix
// Author - Saravana

public class coloumsumofmatrix{
    public static void printColumnSums(int[][] matrix){
        if(matrix.length == 0){
            System.out.println("no elements found");
            return;
        }
      
        for(int i = 0; i < matrix[0].length; i++){
            int sum = 0;
            for(int j = 0; j < matrix.length; j++){
                sum += matrix[j][i];
                 
            }
            System.out.println("Sum of col " + i + " = " + sum);
        }
       
    }
    public static void main(String[] args) {
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        printColumnSums(matrix);        
    }

}