
public class Obstacle {
    
    private int obstacleDamage;
    private int obstacleHealth;
    private int obstacleCoin; 
    private String obstacleName;
    Obstacle(int damage,int health,int coin,String name){
        
        this.setObstacleDamage(damage);
        this.setObstacleHealth(health);
        this.setObstacleCoin(coin);
        this.setObstacleName(name);
    }
    public String getObstacleName() {
        return obstacleName;
    }
    public void setObstacleName(String obstacleName) {
        this.obstacleName = obstacleName;
    }
    public int getObstacleDamage() {
        return obstacleDamage;
    }
    public void setObstacleDamage(int obstacleDamage) {
        this.obstacleDamage = obstacleDamage;
    }
    public int getObstacleCoin() {
        return obstacleCoin;
    }
    public void setObstacleCoin(int obstacleCoin) {
        this.obstacleCoin = obstacleCoin;
    }
    public int getObstacleHealth() {
        return obstacleHealth;
    }
    public void setObstacleHealth(int obstacleHealth) {
        this.obstacleHealth = obstacleHealth;
    }
}
