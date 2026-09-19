class ThridLargest{
    int thridlargest(int[] arr){
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;
        for (int value : arr) {
            if (value > largest) {
                thirdLargest = secondLargest;
                secondLargest = largest;
                largest = value;
            } else if (value > secondLargest && value < largest) {
                thirdLargest = secondLargest;
                secondLargest = value;
            } else if (value > thirdLargest && value < secondLargest) {
                thirdLargest = value;
            }
        }
        return thirdLargest;
    }
}


class FindThridLargest{
    public static void main(String[] args) {    
        ThridLargest th = new ThridLargest();
        int[] arr = {3,1,7,5,3,9,20};
      int result =  th.thridlargest(arr);
        System.out.println("The Thrid Largest number was    "+ result);
    }

}