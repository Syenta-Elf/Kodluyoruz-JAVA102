import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // default 10 yeri var.
        ArrayList<String> aList = new ArrayList<>();

        aList.add("Adana");
        aList.add("Mersin");
        aList.add("İstanbul");
        aList.add("Kayseri");
        aList.add("Diyarbakır");
        aList.add("Zonguldak");

        System.out.println(aList);

        ArrayList<String> newList = new ArrayList<>();

        newList.add("Trabzon");
        newList.addAll(0, aList); // başa index yazarsak ona göre yerleştiriyor. Size'dan büyük yazarsan hata
                                  // fırlatıyor.
        newList.add(3, "Kocaeli");
        System.out.println(newList);

        Object[] objDeneme = newList.toArray();
        String[] deneme = newList.toArray(new String[0]);
        System.out.println(objDeneme[2]);
        System.out.println(deneme[2]);

        String test = newList.toString();
        System.out.println(test);

        aList.clear();
        System.out.println(aList);
    }
}