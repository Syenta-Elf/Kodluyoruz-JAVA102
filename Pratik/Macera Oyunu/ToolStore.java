
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Inventory.Armors.Armor;
import Inventory.Armors.HeavyArmor;
import Inventory.Armors.LigthArmor;
import Inventory.Armors.MediumArmor;
import Inventory.Weapons.Gun;
import Inventory.Weapons.Shotgun;
import Inventory.Weapons.Sword;
import Inventory.Weapons.Weapon;

public class ToolStore extends NormalLoc {
    List<Weapon> weapons;
    List<Armor> armors;
    Weapon weapon = null;
    Armor armor = null;
    Scanner sc = new Scanner(System.in);

    public ToolStore(Player player) {
        super(player, "Market");

        weapons = new ArrayList<>();
        weapons.add(new Gun());
        weapons.add(new Sword());
        weapons.add(new Shotgun());

        armors = new ArrayList<>();
        armors.add(new LigthArmor());
        armors.add(new MediumArmor());
        armors.add(new HeavyArmor());
    }

    @Override
    public boolean onLocation() {

        System.out.println("Şuan Markettesiniz.");
        menu();
        return true;
    }

    public void menu() {
        System.out.println("---------Eşya listesi-------");
        int counter = 0;

        System.out.println("---------Zırh listesi-------");
        for (Armor armor : armors) {
            System.out.println((counter++) + " " + armor.getarmorName() + ": Defans -> "
                    + armor.getarmorDefence() + " Para -> " + armor.getCost());
        }
        counter = 0;

        System.out.println("---------Silah listesi-------");
        System.out.println("----------------------------");
        for (Weapon weapon : weapons) {
            System.out.println((counter++) + " " + weapon.getWeaponName() + ": Hasar -> "
                    + weapon.getWeaponDamage() + " Para -> " + weapon.getCost());
        }
        System.out.println("----------------------------");

        buy();
    }

    public void buy() {
        int id;
        SafeHouse firstHealth = new SafeHouse(player);
        System.out.println("Paranız:"+this.player.getCoin());
        System.out.println("1-Zırh satın al");
        System.out.println("2-Silah satın al");
        System.out.println("ID:");
        int input = sc.nextInt();
        switch (input) {
            case 1:
                id = sc.nextInt();
                if (armors.get(id).getCost() <= this.getPlayer().getCoin()) {
                    this.getPlayer().setCoin(this.getPlayer().getCoin() - armors.get(id).getCost());
                    System.out.println(
                            armors.get(id).getarmorName() + " aldınız." + "Kalan Para:" + this.getPlayer().getCoin());

                    if (this.armor == null) {
                        this.armor = this.armors.get(id);
                        firstHealth.setFirstHealth(armors.get(id).getarmorDefence());
                        this.getPlayer().setHealth(this.getPlayer().getHealth() + this.armor.getarmorDefence());
                        this.armors.remove(id);
                    } else {
                        firstHealth.setFirstHealth(-armors.get(id).getarmorDefence());
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - this.armor.getarmorDefence());
                        this.armors.add(this.armor);
                        this.armor = this.armors.get(id);
                        this.armors.remove(this.armor);
                        firstHealth.setFirstHealth(armors.get(id).getarmorDefence());
                        this.getPlayer().setHealth(this.getPlayer().getHealth() - this.armor.getarmorDefence());
                    }

                } else {
                    System.out.println("O kadar paranız yok. Paranız:" + this.getPlayer().getCoin());
                }
                break;
            case 2:
                id = sc.nextInt();
                if (weapons.get(id).getCost() <= this.getPlayer().getCoin()) {
                    this.getPlayer().setCoin(this.getPlayer().getCoin() - weapons.get(id).getCost());

                    System.out.println(
                            weapons.get(id).getWeaponName() + " aldınız." + "Kalan Para:" + this.getPlayer().getCoin());

                    if (this.weapon == null) {
                        this.weapon = this.weapons.get(id);
                        this.getPlayer().setDamage(this.getPlayer().getDamage() + this.weapon.getWeaponDamage());
                        this.weapons.remove(this.weapon);
                    } else {
                        this.getPlayer().setDamage(this.getPlayer().getDamage() - this.weapon.getWeaponDamage());
                        this.weapons.add(this.weapon);
                        this.weapon = this.weapons.get(id);
                        this.weapons.add(this.weapon);
                        this.getPlayer().setDamage(this.getPlayer().getDamage() + this.weapon.getWeaponDamage());
                    }

                } else {
                    System.out.println("O kadar paranız yok. Paranız:" + this.getPlayer().getCoin());
                }
                break;

            default:
                System.out.println("Hatalı Giriş.");
                break;
        }

    }

}
