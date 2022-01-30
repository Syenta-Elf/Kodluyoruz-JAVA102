import java.util.Comparator;

public class OrderPageComp implements Comparator<Kitap> {

    @Override
    public int compare(Kitap o1, Kitap o2) {
        
        return o1.getSayfaSayisi()-o2.getSayfaSayisi();
    }
    
}
