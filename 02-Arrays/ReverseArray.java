class Reverse {
public static void main(String[] args){
int[] arr = {3,2,1,15,87};
int k = arr.length-1;
for(int i =0; i< arr.length-1; i++){
    if(k<i){
        break;
    }
    else{
int temp = arr[i];
arr[i] = arr[k];
arr[k]= temp;
k--;
    }

  
}
for(int i =0 ;i< arr.length;i++){
    System.out.println(arr[i]);
}



}}