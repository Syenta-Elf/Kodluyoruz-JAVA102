import java.util.Random;

import Inventory.Armors.HeavyArmor;
import Inventory.Armors.LigthArmor;
import Inventory.Armors.MediumArmor;
import Inventory.Weapons.Gun;
import Inventory.Weapons.Shotgun;
import Inventory.Weapons.Sword;

public class Mine extends BattleLoc {
    private static int came=0;
    Random r = new Random();
    public Mine(Player player) {
        super(player,"Maden", new Snake());
    }

    @Override
    public boolean onLocation() {
        if(came==1){
            System.out.println("Madene tekrar gelemezsiniz.");
            return true;
        }
        
        if(super.onLocation()){
            int gainAward = r.nextInt(0,100);
            if(gainAward<55){
                
                //armor
                if(gainAward>=0 &&gainAward<15){
                    gainAward = r.nextInt(0,100);

                    if(gainAward<20){
                        System.out.print("Hafif Zırh Kazandınız.");
                        SafeHouse.setFirstHealth(new LigthArmor().getarmorDefence());
                    }else if(gainAward<50){
                        System.out.print("Orta Zırh Kazandınız.");
                        SafeHouse.setFirstHealth(new MediumArmor().getarmorDefence());
                    }else{
                        System.out.print("Ağır Zırh Kazandınız.");
                        SafeHouse.setFirstHealth(new HeavyArmor().getarmorDefence());
                    }
                    
                }
                //weapon
                else if(gainAward>=15&&gainAward<30){
                    gainAward = r.nextInt(0,100);

                    if(gainAward<20){
                        System.out.println("Tabanca Kazandınız.");
                        this.player.setDamage(this.player.getDamage()+new Gun().getWeaponDamage());
                    }else if(gainAward<50){
                        System.out.println("Kılıç Kazandınız.");
                        this.player.setDamage(this.player.getDamage()+new Sword().getWeaponDamage());
                        
                    }else{
                        System.out.println("Pompalı Kazandınız.");
                        this.player.setDamage(this.player.getDamage()+new Shotgun().getWeaponDamage());
                        
                    }

                }
                //para
                else {
                    

                    gainAward = r.nextInt(0,100);

                    if(gainAward<20){
                        this.getPlayer().setCoin(this.player.getCoin()+10);
                    }else if(gainAward<50){
                        
                    }else{
                        this.getPlayer().setCoin(this.player.getCoin()+5);
                    }

                    this.getPlayer().setCoin(this.player.getCoin()+1);
                }

            }else{
                System.out.println("Eşya kazanamadınız.");
                System.out.println("------------------------------");
            }
            
            came=1;
        }
        return true;
    }
    
    
}
