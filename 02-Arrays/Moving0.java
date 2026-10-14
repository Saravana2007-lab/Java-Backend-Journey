class Moving0 {
    public static void main(String[] args){
    int[] arr = {0, 1, 0, 3, 12};
    int position = 0;
    for(int i =0;i<arr.length;i++){
            if (arr[i] != 0) {
                 arr[position] = arr[i];
               position++;
             }
        }
    for (int i = position; i < arr.length; i++) {

           arr[i] = 0;
            
            }
    for(int i =0; i < arr.length ; i++){
        System.out.println(arr[i]);
    }
    }
    
}
