package Characters;


public abstract class CharClass {
    private String charName;
    private int damage;
    private int health;
    private int coin;

    
    public CharClass(String charName, int damage, int health, int coin) {
        this.charName = charName;
        this.damage = damage;
        this.health = health;
        this.coin = coin;
    }
    public String getCharName() {
        return charName;
    }
    public int getCoin() {
        return coin;
    }
    public void setCoin(int coin) {
        this.coin = coin;
    }
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }
}
