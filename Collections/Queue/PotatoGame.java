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
              sc.nextLine();

        System.out.println("enter each player name");
                 for(int i= 1; i <= playernumber ;i++){
                         System.out.println("Enter the name of " + i +" name");
                             String name = sc.nextLine();
                             players.offer(name);
      }
        System.out.println("Enter how many roataion");
        int roation = sc.nextInt();
while(players.size() > 1){
        for(int i =0 ; i < roation-1; i++){
            players.offer(players.poll());
        }
        String killed = players.poll();
        System.out.println("the played killed was "+ killed);
      }
      System.out.println("The Winner is " + players.peek());
    }
}