

public class Maximum_of_Two_Numbers {
    public static int max(int a,int b){
        if(a>b){
        return a;
        }
        else{
            return b;
        }
    }
    public static void main(String[] args){
        int result  = max(30,59);
        System.out.println(result);
    }
}
