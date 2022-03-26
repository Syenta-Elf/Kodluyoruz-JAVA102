import java.util.Random;

public class Snake extends Obstacle {
    private static Random r = new Random() ;
    private static int damage = r.nextInt(3,7);

    Snake() {
        super(damage, 12, 0, "Yılan");
        
    } 
}
