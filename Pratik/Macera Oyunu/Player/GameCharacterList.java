package Player;

import Characters.GameCharacter;
import Characters.Jhin;
import Characters.Knight;
import Characters.Ranger;
import Characters.Samurai;

public class GameCharacterList {
    
    private GameCharacter[] gameCharacterList;
        public GameCharacterList()
        {
            GameCharacter[] gameCharacters = {new Samurai(),new Ranger(),new Knight(),new Jhin()};
            setGameCharacterList(gameCharacters);
        }
        public GameCharacter[] getGameCharacterList() {
            return gameCharacterList;
        }
        public void setGameCharacterList(GameCharacter[] gameCharacterList) {
            this.gameCharacterList = gameCharacterList;
        }

        public void showList()
        {
            GameCharacter[] gameCharacters = getGameCharacterList();

            int count = 1;
            for (GameCharacter gameCharacter : gameCharacters) {
            
            System.out.println("["+count+"] "+gameCharacter.getCharName()+"\t|\tdamage: "+gameCharacter.getDamage()+"\thealth: "+gameCharacter.getHealth()+"\tcoin: "+gameCharacter.getCoin());
            count++;
        }
                
            
        }
   
}
