package Player;
import Characters.GameCharacter;

public class Player {
    private String charName;
    private String playerName;
    private int damage;
    private int health; 
    private int coin;
    private Inventory inventory;

    //Seçilen karakterin değerelerini atadık.
    public void selectChar(int select)
    {
        GameCharacterList gameCharacterList = new GameCharacterList();
        GameCharacter[] charList= gameCharacterList.getGameCharacterList();

        System.out.println("Artık sen bir "+charList[select-1].getCharName()+"'sın "+this.playerName+" !");
        this.damage = charList[select-1].getDamage();
        this.health = charList[select-1].getHealth();
        this.coin = charList[select-1].getCoin();

        if(select==4)
        {
            System.out.println("Ama sen şarjörünü doldurana kadar öldün, yazık!");
        }
           
    }

    public Player(String playerName) {
        this.setPlayerName(playerName);
    }
    public String getPlayerName() {
        return playerName;
    }
    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }
    public Inventory getInventory() {
        return inventory;
    }
    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
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
    public String getCharName() {
        return charName;
    }
    public void setCharName(String charName) {
        this.charName = charName;
    }
}
