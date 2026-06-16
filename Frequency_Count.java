public class Frequency_Count {
    public static void main(String[] args){
        int[] a = {1,3,2,2,2,1};
        int target = 2;
        int count = 0;
        for(int i = 0;i<a.length;i++){
            if(a[i]==target){
                count++;
            }
        }
        System.out.println("the amount 2 in array is " + count);
    }
}
