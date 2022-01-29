import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) {
        //sıralama özelliği sağlanıyor. 
        PriorityQueue<String> pq = new PriorityQueue<>(new Comparator<String>() {

            @Override
            public int compare(String o1, String o2) {
                
                return o1.compareTo(o2);
            }
            
        });

        pq.add("e");
        pq.add("a");
        pq.add("d");

        for (String string : pq) {
                System.out.println(string);
        }
    }
}
