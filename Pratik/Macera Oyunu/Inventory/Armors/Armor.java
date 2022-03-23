package Inventory.Armors;

public abstract class Armor {
    private String armorName;
    private int armorDefence;
    private int cost;

    public Armor(String armorName, int armorDefence, int cost) {
        this.armorName = armorName;
        this.armorDefence = armorDefence;
        this.cost = cost;
    }
    public String getarmorName() {
        return armorName;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }
    public int getarmorDefence() {
        return armorDefence;
    }
    public void setarmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }
}
