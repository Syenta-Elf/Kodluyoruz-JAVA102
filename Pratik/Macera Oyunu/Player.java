
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Characters.CharClass;
import Characters.Knight;
import Characters.Ranger;
import Characters.Samurai;
import Inventory.Inventory;

public class Player {
    Location location = null;

    Inventory inventory;
    private CharClass charClass;
    private String playerName;
    private int damage;
    private int health;
    private int coin;
    Scanner sc;

    public void selectChar(CharClass charClass) {

        this.charClass = charClass;
        this.inventory = new Inventory();
        this.damage = this.charClass.getDamage();
        this.coin = this.charClass.getCoin();
        this.health = this.charClass.getHealth();
        System.out.println("\n\n------------------------------------------------------------");
        System.out.println("Seçtiğiniz sınıf : " + this.charClass.getCharName());
        System.out.println("------------------------------------------------------------");

    }

    public void selectCharList() {

        List<CharClass> charClasses = new ArrayList<>();
        charClasses.add(new Samurai());
        charClasses.add(new Ranger());
        charClasses.add(new Knight());
        int i = 0;
        System.out.println("------------------------------------------------------------");
        for (CharClass charClass : charClasses) {

            System.out.println("\n" + (i++) + " " + charClass.getCharName() + "-> Hasar : " + charClass.getDamage()
                    + " Sağlık: " + charClass.getHealth() + " Para : " + charClass.getCoin() + "\n");
            System.out.println("------------------------------------------------------------");
        }

        sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Karakter seçin :");
                selectChar(charClasses.get(sc.nextInt()));
                break;
            } catch (Exception e) {
                System.out.println("Hatali giriş. Tekrar deneyin.");
                sc.next();
                continue;
            }
        }

    }

    public void selectLoc() {
        boolean b = true;
        // oyuncunun evde başlayıp can kaydının alınması için yazdım.
        System.out.println("\n");
        location = new SafeHouse(this);
        location.onLocation();
        System.out.println("------------------------------");
        while (b) {

            if (this.inventory.isFirewood() && this.inventory.isFood() && this.inventory.isWater()) {
                System.out.println("Tebrikler oyunu bitirdiniz!");
                break;
            }
            if(!(this.getHealth()>0)){
                break;
            }

            System.out.println("\nGidebileceğiniz bölgeler:");
            System.out.println("------------------------------");
            System.out.println("1-Güvenli Ev\n");
            System.out.println("2-Market\n");
            System.out.println("3-Orman\n");
            System.out.println("4-Mağara\n");
            System.out.println("5-Nehir\n");
            System.out.println("6-Maden");
            System.out.println("------------------------------");
            System.out.print("Seçiniz:");

            try {
                int selectLoc = sc.nextInt();
                switch (selectLoc) {
                    case 1:
                        location = new SafeHouse(this);
                        b = location.onLocation();
                        break;
                    case 2:
                        location = new ToolStore(this);
                        b = location.onLocation();
                        break;
                    case 3:
                        location = new Forest(this);
                        b = location.onLocation();
                        break;
                    case 4:
                        location = new Cave(this);
                        b = location.onLocation();
                        break;
                    case 5:
                        location = new River(this);
                        b = location.onLocation();
                        break;
                    case 6:
                        location = new Mine(this);
                        b = location.onLocation();
                        break;

                    default:
                        break;
                        
                }
                
                System.out.println("------------------------------");
            } catch (Exception e) {
                System.out.println("Hatali giriş, tekrar deneyin.");
                sc.next();
            }

        }

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
