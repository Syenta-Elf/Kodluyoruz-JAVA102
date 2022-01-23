import java.util.Scanner;

import Locations.Location;
import Player.GameCharacterList;
import Player.Player;

public class Game {
    public Location location;
    public Scanner sc = new Scanner(System.in);
    
    public void start()
    {
        GameCharacterList gameCharacterList = new GameCharacterList();

        System.out.println("Hoşgeldin!");
        System.out.println("Lütfen bir isim girin :");//düzenlenecek
        Player player = new Player("elf");
        System.out.println(player.getPlayerName()+" sisli adaya hoşgeldin!");
        System.out.println("Lütfen bir karakter seç!");
        gameCharacterList.showList();

        int select = sc.nextInt();
        while(select>gameCharacterList.getGameCharacterList().length || select<0 && select!=4)
        {
            System.out.println("Lütfen geçerli bir sayı gir.");
            select = sc.nextInt();
        }
        player.selectChar(select);
        
    }

}
