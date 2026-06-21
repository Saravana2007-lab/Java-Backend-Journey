    
//Smallest Element Using Method
// Author - Saravana

public class SmallestElementInArray {


    public int findSmallest(int[] arr){
        
        int smallest = arr[0];

        for(int i = 1; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }

return smallest;
    }
    public static void main(String [] args){
        int[] arr = {1,2,3,4};
        SmallestElementInArray s = new SmallestElementInArray();
        int result = s.findSmallest(arr);
        System.out.println("Smallest element = " + result);
    }
}


