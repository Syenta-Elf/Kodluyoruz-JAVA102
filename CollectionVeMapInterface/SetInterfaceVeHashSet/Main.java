import java.util.HashSet;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        //Biz verdikçe genişleyen bir yapısı var. Kümeler unique'tir eleman tekrarlamaz. 
        //Hafızada tuttuğu yere göre sıralanıyor, garanti vermiyor.
        HashSet<Integer> hSet = new HashSet<>();
        

        hSet.add(2);
        hSet.add(15);
        hSet.add(156);
        hSet.add(185);
        hSet.add(90);
        hSet.add(null);
        
        hSet.remove(2);
        
        System.out.println(hSet);

        
        for (Integer item : hSet) {
            
            System.out.println(item);
        }
        Iterator<Integer> itr = hSet.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next());
        }

    }
}