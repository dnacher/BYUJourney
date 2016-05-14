package journey;

import java.util.List;
import journey.characters.Character;

public class Journey {
    
     public static void createCharacter(){
       Character CharacterOne= new Character();
       CharacterOne.setName("Gandalf");
       CharacterOne.setHp(100);
       String playerInfo= CharacterOne.toString();
       System.out.println(playerInfo);
    }
     
     
    
    private List<Character>PlayerList;

    public static void main(String[] args) {
        
        createCharacter();
      
      
    }
    
   
    
}
