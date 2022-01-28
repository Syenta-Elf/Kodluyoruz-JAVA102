import java.util.Iterator;
import java.util.LinkedHashSet;

public class Main {
    public static void main(String[] args) {
        //Girenle çıkanın garantisini veriyor, sıralı.
        LinkedHashSet<Integer> lSet = new LinkedHashSet<>();
        lSet.add(10);
        lSet.add(30);
        lSet.add(40);
        lSet.add(20);
        Iterator<Integer> itr = lSet.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }
}
