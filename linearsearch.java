public class linearsearch {
    public static void main(String[] args){
    int[] a = {1,2,3,4,5};
    int key = 4;
    int found =-1; 

    for(int i = 0; i < a.length;i++){
        if(key == a[i]){
            found = i;
            break;
        }
    }
    if(found == -1){
        System.out.println("element not found");
    }
    else{
        System.out.println("element found at" + found);
    }
    }
}
