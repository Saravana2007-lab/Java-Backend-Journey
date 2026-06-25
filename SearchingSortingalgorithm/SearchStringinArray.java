package SearchingSortingalgorithm;

public class SearchStringinArray {
    public static int searchString(String[] arr, String target) {
   
        if (arr == null) {
            System.out.println("Array is null");
            return -1;
        }
        
    
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return -1;
        }
        
     
     
        for (int i = 0; i < arr.length; i++) {
            if (target.equals(arr[i])) {
                System.out.println("Found at index " + i);
                return i;
            }
        }
        
        System.out.println("Not Found");
        return -1;
    }
    
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C", "JavaScript"};
        
        
        int result = searchString(languages, "Python");
        
      ;
    }
}
