import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> liste = new LinkedList<>();
        liste.add("Elif");
        liste.add("Deniz");
        liste.add("Ömer");
        liste.add("Burak");

        Iterator<String> itr = liste.iterator();

        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }
    }    
}
