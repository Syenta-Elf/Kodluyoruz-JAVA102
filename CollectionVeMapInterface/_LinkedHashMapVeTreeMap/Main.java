import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<Integer,Student> lHm = new LinkedHashMap<>();
        //ilk giren ilk çıkar mantığı var yine.

        lHm.put(12133, new Student("Elif",12));
        lHm.put(12763, new Student("Berk",32));
        lHm.put(12563, new Student("Damla",82));
        lHm.put(12343, new Student("Ebru",95));
        lHm.put(16453, new Student("Serkan",95));

        for (Integer num : lHm.keySet()) {
            System.out.println(num+" - "+lHm.get(num).getName());
        }
        System.out.println("****************************************");
        HashMap<Integer,Student> lHm2 = new HashMap<>();

        lHm2.put(12133, new Student("Elif",12));
        lHm2.put(12763, new Student("Berk",32));
        lHm2.put(12563, new Student("Damla",82));
        lHm2.put(12343, new Student("Ebru",95));
        lHm2.put(16453, new Student("Serkan",95));

        for (Integer num : lHm2.keySet()) {
            System.out.println(num+" - "+lHm2.get(num).getName());
        }
        System.out.println("*****************************");
        //kendi sıralamamızı oluşturabiliyoruz.
        TreeMap<Integer,Student> tm = new TreeMap<>(new OrderByNumberComp());

        tm.put(12133, new Student("Elif",12));
        tm.put(12763, new Student("Berk",32));
        tm.put(12563, new Student("Damla",82));
        tm.put(12343, new Student("Ebru",95));
        tm.put(16453, new Student("Serkan",95));

        for (Integer num : tm.keySet()) {
            System.out.println(num+" - "+tm.get(num).getName());
        }

    }
}
