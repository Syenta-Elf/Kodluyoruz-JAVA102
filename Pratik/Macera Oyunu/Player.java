import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Characters.CharClass;
import Characters.Ranger;
import Characters.Samurai;
import Inventory.Inventory;

public class Player {
    private Inventory inventory;
    private CharClass charClass;
    private String playerName;
    private int damage;
    private int health;
    private int coin;

    public void selectChar(CharClass charClass) {

        this.charClass = charClass;
        this.inventory = new Inventory();
        this.damage = this.charClass.getDamage();
        this.coin = this.charClass.getCoin();
        this.health = this.charClass.getHealth();

        System.out.println("Seçtiğiniz sınıf : "+ this.charClass.getCharName());

    }

    public void selectCharList() {

        List<CharClass> charClasses = new ArrayList<>();
        charClasses.add(new Samurai());
        charClasses.add(new Ranger());
        int i = 0;
        for (CharClass charClass : charClasses) {
            System.out.println((i++) + " " + charClass.getCharName() + ": Damage " + charClass.getDamage()
                    + " : Health " + charClass.getHealth() + ": Coin " + charClass.getCoin());
        }
        
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            try {
                System.out.println("Karakter seçin :");
                selectChar(charClasses.get(sc.nextInt()));
                
                break;
            } catch (Exception e) {
                System.out.println("Hatali giriş. Tekrar deneyin.");
                continue;
            }
        }
        sc.close();
        

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
}
