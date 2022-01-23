package Locations.BattleLoc;

import Locations.Obstacle.Obstacle;
import Player.Player;

public class Cave extends BattleLoc {

    protected Cave(Player player, String name, Obstacle obstacle) {
        super(player, name, obstacle);
        //TODO Auto-generated constructor stub
    }

    @Override
    public void combat()
    {
        
    }

    @Override
    public boolean onLocation() {
        // TODO Auto-generated method stub
        return false;
    }
   
   
    
}
