package Inventory.Weapons;
public abstract class Weapon {
    private String weaponName;
    private int weaponDamage;
    private int cost;

    public String getWeaponName() {
        return weaponName;
    }
    public int getCost() {
        return cost;
    }
    public void setCost(int cost) {
        this.cost = cost;
    }
    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }
    public int getWeaponDamage() {
        return weaponDamage;
    }
    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }
}
