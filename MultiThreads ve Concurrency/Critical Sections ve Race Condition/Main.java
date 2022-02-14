import java.util.ArrayList;

public class Main {
public static void main(String[] args) throws InterruptedException {
    OrderWindow o = new OrderWindow();
    
    ArrayList<Thread> islemler = new ArrayList<>();

    for (int i = 0; i < 100; i++) {
        Thread t = new Thread(o);
        islemler.add(t);
        t.start();
            
    }
    
    
    
    
}


}
