

public class River extends BattleLoc {

    public River(Player player) {
        super(player, "Nehir", new Bear());
        
    }
    @Override
    public boolean onLocation() {
        if(this.player.getInventory().isWater()){
            System.out.println("Ormana tekrar gelemezsiniz.");
            return true;
        }
        if(super.onLocation()){
            System.out.println("Su alındı.");
            this.player.getInventory().setWater(true);
        }
        
        return true;
    }
}
