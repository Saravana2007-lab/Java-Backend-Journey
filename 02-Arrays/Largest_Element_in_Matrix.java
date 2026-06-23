// Largest Element in Matrix
// Author - Saravana

public class Largest_Element_in_Matrix {
    public static void main(String[] args){
        int a[][] = {
    {1,2,3},
    {4,50,6},
    {7,8,9}
};
        int largest = a[0][0];
        for(int i = 0; i < a.length; i++){
            int j = 0;
            while(j < a[i].length){
                if(a[i][j] > largest){
                    largest = a[i][j];
                }
                j++;
            }
        }
        System.out.println(largest);
       
    }
}
