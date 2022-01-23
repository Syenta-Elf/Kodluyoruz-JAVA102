/**
 * Main
 */
public class Main {

    public static void main(String[] args) {
     
        int a = 10;
        //AutoBoxing
        Integer b = a;
        
        //Boxing
        Integer c = Integer.valueOf(a);

        //AutoUnboxing
        int d = c;

        //Unboxing
        int e = c.intValue();
    }
}