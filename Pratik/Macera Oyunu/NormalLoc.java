public class NormalLoc extends Location {

    public NormalLoc(Player player, String string) {
        super(player, "Güvenli Bölge");
    }
    @Override
    public boolean onLocation() { 
        return true;
    }
    
}
