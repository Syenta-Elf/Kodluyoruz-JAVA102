public class SafeHouse extends NormalLoc{
    static private int firstHealth=0;

    public SafeHouse(Player player) {
        super(player,"Güvenli ev");
        //TODO Auto-generated constructor stub
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

    
    
}
