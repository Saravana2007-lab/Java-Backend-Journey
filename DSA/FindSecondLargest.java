public class FindSecondLargest {
    int secondlargest(int arr[]){
          int max = arr[0];
          int second_largest = Integer.MIN_VALUE;
     for(int i = 1;i<arr.length; i++){
            if(arr[i]  > max){
                second_largest = max;
                max = arr[i];
            }
            else if(arr[i] < max && arr[i] > second_largest){
                second_largest = arr[i];
            }
        }
        return second_largest;
    }
    public static void main(String[] args) {
         FindSecondLargest s = new FindSecondLargest();
         int[] arr ={23,76,33,67,32};
         int second = s.secondlargest(arr);
         System.out.println("The second largest is :"+ second);
 }
}
