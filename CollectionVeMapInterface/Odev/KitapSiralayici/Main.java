import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {

        Set<Kitap> kitaplar = new TreeSet<>(new OrderNameComp());

        kitaplar.add(new Kitap("abc",100,2));
        kitaplar.add(new Kitap("adc",50,2));
        kitaplar.add(new Kitap("bfas",130,2));
        kitaplar.add(new Kitap("abe",90,2));
        kitaplar.add(new Kitap("bad",20,2));

        System.out.println("*****Kitap Adına Göre*****");
        for (Kitap kitap : kitaplar) {
            
            System.out.println(kitap.getKitapIsmi()+" "+kitap.getSayfaSayisi());
        }

        System.out.println("*****Sayfa Sayısına Göre*****");
        Set<Kitap> kitaplar2 = new TreeSet<>(new OrderPageComp());
        kitaplar2.addAll(kitaplar);

        for (Kitap kitap : kitaplar2) {
            
            System.out.println(kitap.getKitapIsmi()+" "+kitap.getSayfaSayisi());
        }

        
    }
}