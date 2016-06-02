package citbyu.cit260.journey;

import citbyu.cit260.journey.control.controlPlace;
import java.util.List;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.model.characters.enums.Warriors;
import citbyu.cit260.journey.view.StartProgramView;
import java.util.ArrayList;

import static java.util.Collections.list;

public class Journey {
    
     public static void createCharacter(){
       Character CharacterOne= new Character();
       CharacterOne.setName("Gandalf");
       CharacterOne.setHp(100);
       String playerInfo= CharacterOne.toString();
       System.out.println(playerInfo);
    }
     
     public static void test(List<Warrior> l){
          for(Warrior w: l){
              if(w!=null){
              System.out.println(w.toString());
              }
              else{
              System.out.println("null");
              }
       
    }
        
    }
    
    private List<Character>PlayerList;

    public static void main(String[] args) {
       
        StartProgramView.displayStartProgramView();
    
    }
    
    
}
