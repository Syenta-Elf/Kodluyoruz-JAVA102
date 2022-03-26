
public class Forest extends BattleLoc {

    public Forest(Player player) {
        super(player, "Orman", new Vampire());
    }

    @Override
    public boolean onLocation() {
        if(this.player.getInventory().isFirewood()){
            System.out.println("Ormana tekrar gelemezsiniz.");
            return true;
        }
        if(super.onLocation()){
            System.out.println("Odun alındı.");
            this.player.getInventory().setFirewood(true);
        }

        return true;
    }
    
}
