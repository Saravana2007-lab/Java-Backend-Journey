class RemoveDuplicates{
    public static void main(String[] args){
     int[] arr = {0,0,1,1,1,2,2,2};
     int k = 1;
        for(int i =1; i< arr.length;i++){
            if(arr[i] != arr[k-1]){
                arr[k] = arr[i];
                k++;
            }
        }
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}        System.out.println(k);

    }
}