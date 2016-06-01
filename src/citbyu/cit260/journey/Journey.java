package citbyu.cit260.journey;

import citbyu.cit260.journey.control.controlPlace;
import java.util.List;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.model.characters.Warrior;
import citbyu.cit260.journey.model.characters.enums.Warriors;
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
        List<Warrior> l= new ArrayList<>();
        Warrior w = new Warrior(Warriors.ORC, 100);
        l.add(0, w);
        l.add(1, w);
        l.add(2, w);
        controlPlace p= new controlPlace();        
        List<Warrior> l2= p.moveEnemies(l);
        test(l2);
   /* List<Warrior> l= new ArrayList<Warrior>();
    List<Warrior> l2= new ArrayList<Warrior>();
    Warrior w=new Warrior(Warriors.ORC, 100);
    l.add(0, w);
    l.add(1,w);
    l.add(2, w);
    l2.add(0, null);
    l2.add(1,null);
    l2.add(2, null);
    l2.add(3, l.get(0));
    l2.add(4, l.get(1));
    l2.add(5, l.get(2));
        test(l);
        System.out.println("--------------------------------");
        test(l2);*/
    
    }
    
    
}