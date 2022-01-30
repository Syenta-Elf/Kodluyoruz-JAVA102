import java.util.Comparator;

public class OrderNameComp implements Comparator<Kitap> {

    @Override
    public int compare(Kitap o1, Kitap o2) {
        
        return o1.getKitapIsmi().compareTo(o2.getKitapIsmi());
    }
    
}
