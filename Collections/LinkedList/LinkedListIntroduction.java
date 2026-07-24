    package Collections.LinkedList;
    import java.util.LinkedList;
    import java.util.List;

    public class LinkedListIntroduction {
        public static void main(String[] args) {
        
        List<String> list =  new LinkedList<>();
        list.addFirst("Saravan");
        list.add("Aaron");
        list.addLast(null);
        for(int i =0; i< list.size()-1;i++){
        System.out.print(list.get(i)+ "->");
        }
        System.out.println(list.getLast());
        System.out.println("\n---------------");
        list.remove("Aaron");
          for(int i =0; i< list.size()-1;i++){
        System.out.print(list.get(i)+ "->");
        }
        System.out.println(list.getLast());
        }
    }
