public class Game {
    static Player player = new Player();
    
    

    public void start() {
        System.out.println("Gölge Ada'ya hoşgeldiniz!");
        player.setPlayerName("Syenta");
        System.out.println("Adınız :" + player.getPlayerName());

        player.selectCharList();
        player.selectLoc();
        
    }
}
