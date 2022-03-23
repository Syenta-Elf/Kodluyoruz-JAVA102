package Inventory;

import Inventory.Armors.Armor;
import Inventory.Weapons.Weapon;

public class Inventory {
    private boolean water;
    private boolean food;
    private boolean firewood;
    private Weapon weapon;
    private Armor armor;
    
    public boolean isWater() {
        return water;
    }
    public Armor getArmor() {
        return armor;
    }
    public void setArmor(Armor armor) {
        this.armor = armor;
    }
    public Weapon getWeapon() {
        return weapon;
    }
    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    public void setWater(boolean water) {
        this.water = water;
    }
    public boolean isFood() {
        return food;
    }
    public void setFood(boolean food) {
        this.food = food;
    }
    public boolean isFirewood() {
        return firewood;
    }
    public void setFirewood(boolean firewood) {
        this.firewood = firewood;
    }
}
