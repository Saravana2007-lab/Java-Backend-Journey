//largest of three
//author- Saravana 
import java.util.Scanner;
class largest{
    public static void main(String[] args){
        Scanner sa = new Scanner(System.in);
        System.out.println("enter the first number");
        int a = sa.nextInt();
        System.out.println("enter the second number");
        int b = sa.nextInt();
        System.out.println("enter the third number");
        int c = sa.nextInt(); 
        
    if(a>=b && a>=c){
        System.out.println("first number is the largest "+ a);
    }
    else if(b>=a && b>=c){
        System.out.println("second number is the largest "+ b);
    }
    else{
        System.out.println("third number is the largest "+ c);
    }
    sa.close();
    }
}