public class FindSecondSmallest {
       int secondsmallest(int arr[]){
          int min = arr[0];
          int secondsmallest = Integer.MAX_VALUE;
     for(int i = 1;i<arr.length; i++){
            if(arr[i]  < min){
                secondsmallest = min;
                min = arr[i];
            }
            else if(arr[i] > min && arr[i] < secondsmallest){
                secondsmallest = arr[i];
            }
        }
        return secondsmallest;
    }
    public static void main(String[] args) {
         FindSecondSmallest s = new FindSecondSmallest();
         int[] arr ={23,76,33,67,32};
         int second = s.secondsmallest(arr);
         System.out.println("The second largest is :"+ second);
 }
}
