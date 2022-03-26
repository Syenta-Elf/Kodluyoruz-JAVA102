

public class Cave extends BattleLoc {

    public Cave(Player player) {
        super(player, "Mağara", new Zombie());
        
    }
    @Override
    public boolean onLocation() {
        if(this.player.getInventory().isFood()){
            System.out.println("Mağara'ya tekrar gelemezsiniz.");
            return true;
        }
        if(super.onLocation()){
            System.out.println("Yemek alındı.");
            this.player.getInventory().setFood(true);
        }

        return true;
    }
    
}
