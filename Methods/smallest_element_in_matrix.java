// Smallest Element In Matrix
// Author - Saravana
public class smallest_element_in_matrix {
    public int findSmallest(int[][] matrix){

        int smallest = matrix[0][0];
        for(int i = 0; i < matrix.length; i++){
            int j = 0;
            while(j < matrix[i].length){
                if(matrix[i][j] < smallest){
                    smallest= matrix[i][j];
                }
                j++;
            }
        }
        
        return smallest; 
    }
    public static void main(String[] args) {
         int[][] a = {
    {1,2,3},
    {4,50,6},
    {7,8,9}
};
smallest_element_in_matrix sm = new smallest_element_in_matrix();
    int result = sm.findSmallest(a);
    System.out.println("Smallest Element = " + result);
    }
    
}

      
    