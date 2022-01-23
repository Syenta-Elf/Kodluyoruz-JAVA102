package Locations;
import Player.Player;

public abstract class Location {
    private Player player;
    private String name;

    public abstract boolean onLocation();

    protected Location(Player player,String name)
    {
        this.setPlayer(player);
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
