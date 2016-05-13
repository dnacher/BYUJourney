package journey;

import java.util.List;
import journey.characters.Character;
import journey.characters.Warrior;
import journey.dialogs.Battle;
import journey.enums.Warriors;
import journey.game.Game;
import journey.game.dice.Dice;

public class Journey {
    
    private List<Character>PlayerList;

    public static void main(String[] args) {
        
       Character CharacterOne= new Character();
       CharacterOne.setName("Gandalf");
       CharacterOne.setHp(100);
       String playerInfo= CharacterOne.toString();
       System.out.println(playerInfo);
      
    }
    
    
    
}
