import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        OrderWindow o = new OrderWindow();

        ExecutorService pool = Executors.newFixedThreadPool(2);

        for (int i = 0; i < 100; i++) {
            pool.execute(o);
        }

        
    }
}
