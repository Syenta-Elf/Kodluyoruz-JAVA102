import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String,String> country = new HashMap<>(); // => HashMap<String,String> c =  new HashMap<>();

        country.put("tr", "Turkiye");
        country.put("abd", "Amerika");
        country.put("de", "Almanya");
        country.put("en", "Ingiltere");

        System.out.println(country.get("tr"));

        System.out.println(country.remove("en")+" silindi.");
        System.out.println("key yoksa"+country.remove("en")+" döner.");
    
        for (String string : country.values()) {
            System.out.println(string);
        }
        for (String string : country.keySet()) {
            //System.out.println(string);
            System.out.println(country.get(string)+" "+string);
        }

        country.replace("de","Alamanya");
        System.out.println(country.get("de"));

        
    }
}
