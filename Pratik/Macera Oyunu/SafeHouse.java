
public class SafeHouse extends NormalLoc{
    static private int firstHealth=0;

    public SafeHouse(Player player) {
        super(player,"Güvenli ev");
        
    }

    @Override
    public boolean onLocation() {

        if(firstHealth==0){
            firstHealth = this.getPlayer().getHealth(); 
            System.out.println("Şuan Evinizdesiniz.");
        }else
        {
            this.getPlayer().setHealth(firstHealth);
            System.out.println("Dinlendiniz. Canınız: "+this.getPlayer().getHealth());
        }
            
        return true;
    }
    public static void setFirstHealth(int armor){
        SafeHouse.firstHealth += armor;
    }     
    
}
