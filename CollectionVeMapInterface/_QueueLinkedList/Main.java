import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        //get metodu yok. Bir elemanı bulmak için tüm kuyruğu gezmesi gerekiyor.
        Queue<String> q = new LinkedList<>();

        q.add("test");
        q.add("test1");
        q.add("test2");
        q.add("test3");
        q.remove("test2"); //objenin adını yazınca siliyor, geriye değerini de döndürüyor.
        //System.out.println(q.remove("test2")); //objenin adını yazınca siliyor, geriye true-false döndürüyor.

        System.out.println(q.element()); //kuyruk başındaki elemanı çağırır.
        System.out.println(q.poll());    //kuyruk başındaki kuyruktan siler, geriye kendini döndürür.
        System.out.println(q.element());
        System.out.println(q.peek()+"++ "); // peek() metodu kuyruğun başındaki öğeyi verir; onu kuyruktan atmaz.
                                            // Kuyruk boş ise false değerini verir.

        Iterator<String> itr = q.iterator();
        
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
