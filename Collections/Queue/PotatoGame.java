package Collections.Queue;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class PotatoGame{
    public static void main(String[] args) {
        Queue<String> players = new LinkedList<>();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter how many players");
              int playernumber = sc.nextInt();

        System.out.println("enter each player name");
                 for(int i= 1; i <= playernumber ;i++){
                         System.out.println("Enter the name of" + i +" name");
                             String name = sc.nextLine();
                             sc.nextLine();
                             players.offer(name);
      }
        System.out.println("Enter how many rortaion");
        int roation = sc.nextInt();

        for(int i =0 ; i < roation ; i++){
            if(len(players) == 1){}
        }
    }
}