
public class Game {
    Player player = new Player();;
    Location location;

    public void start()
    {
        System.out.println("Gölge Ada'ya hoşgeldiniz!");
        player.setPlayerName("Syenta");
        System.out.println("Adınız :"+player.getPlayerName());
        
        player.selectCharList();
        
    }
}
