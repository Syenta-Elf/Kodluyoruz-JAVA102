
import java.util.Random;

public class BattleLoc extends Location {

    int resetObstacleHealth;

    public BattleLoc(Player player, String name, Obstacle obstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.resetObstacleHealth = obstacle.getObstacleHealth();

    }

    Obstacle obstacle;
    String award;
    int obstacleCount;
    Random r = new Random();

    @Override
    public boolean onLocation() {
        combat();

        if (this.player.getHealth() <= 0) {
            System.out.println("Öldünüz, oyun bitti.");
            return false;
        } else {
            System.out.println("Kalan can: " + this.getPlayer().getHealth());
            this.player.setCoin(this.player.getCoin() + this.obstacle.getObstacleCoin() * obstacleCount);
        }
        return true;
    }

    public void combat() {
        this.obstacleCount = r.nextInt(1, 4);
        System.out.println("\n\nKarşında " + this.obstacleCount + " tane " + this.obstacle.getObstacleName() + " var.");
        System.out.println("------------------------------");

        for (int i = 0; i < this.obstacleCount; i++) {

            // ilk kimin vuracağını belirliyoruz
            System.out.println((i+1)+". "+this.obstacle.getObstacleName());
            int firstHit = r.nextInt(0, 2);
            while (true) {
                if (this.player.getHealth() <= 0) {
                    // Öldünüz
                    break;
                }
                if (firstHit == 0) {
                    System.out.println("------------------------------");
                    PlayerHit();
                    if (ObstacleDeath(i)) {
                        break;
                    }
                    ObstacleHit();
                    System.out.println("------------------------------");
                } else {
                    System.out.println("------------------------------");
                    ObstacleHit();
                    PlayerHit();
                    System.out.println("------------------------------");
                    if (ObstacleDeath(i)) {
                        break;
                    }
                }
            }
            this.obstacle.setObstacleHealth(this.resetObstacleHealth);
        }
    }

    private boolean PlayerHit() {
        this.obstacle.setObstacleHealth(this.obstacle.getObstacleHealth() - this.player.getDamage());
        System.out.println(this.player.getDamage() + " hasar vurdun. Canavarın kalan canı: "
                + this.obstacle.getObstacleHealth() + "\n");
        return true;
    }

    private boolean ObstacleHit() {
        this.player.setHealth(this.player.getHealth() - this.obstacle.getObstacleDamage());
        System.out.println(
                this.obstacle.getObstacleDamage() + " hasar aldın. Kalan canın: " + this.player.getHealth());

        if (this.player.getHealth() <= 0) {
            return false;
        }
        return true;
    }

    private boolean ObstacleDeath(int i) {
        if (this.obstacle.getObstacleHealth() <= 0) {
            System.out.println("------------------------------");
            System.out.println((i+1)+". "+this.obstacle.getObstacleName() + " öldü.");
            System.out.println("------------------------------");
            return true;
        }
        return false;
    }

}
