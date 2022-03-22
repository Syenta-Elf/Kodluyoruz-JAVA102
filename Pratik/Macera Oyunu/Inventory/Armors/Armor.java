package Inventory.Armors;

public abstract class Armor {
    private String artmorName;
    private int armorDefence;
    private int cost;

    public String getartmorName() {
        return artmorName;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setartmorName(String artmorName) {
        this.artmorName = artmorName;
    }
    public int getarmorDefence() {
        return armorDefence;
    }
    public void setarmorDefence(int armorDefence) {
        this.armorDefence = armorDefence;
    }
}
