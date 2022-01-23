package Locations.BattleLoc;

import Locations.Location;
import Locations.Obstacle.Obstacle;
import Player.Player;

public abstract class BattleLoc extends Location {

    public Obstacle obstacle;
    protected BattleLoc(Player player, String name,Obstacle obstacle) {
        super(player, name);
        this.obstacle = obstacle;
    }

    public boolean onLocation()
    {
        return true;
    }
    public abstract void combat();
}
