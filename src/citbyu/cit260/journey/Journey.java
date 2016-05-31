package citbyu.cit260.journey;

import java.util.List;
import citbyu.cit260.journey.model.characters.Character;
import citbyu.cit260.journey.control.Dice;
import citbyu.cit260.journey.control.controlPlace;
import citbyu.cit260.journey.control.controlPlayer;
import citbyu.cit260.journey.model.Player.Player;
import citbyu.cit260.journey.view.dialogs.Dialog;

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
        
            
       //TEST Dice Class
       //  testRollDice();
        // testProbability();
        Dialog.dialog1();
       //TEST controlPlayer Class 
         //Player p= new Player();
         //controlPlayer c= new controlPlayer();
        // testCalculateTime(c);
        // testlookForItem(c);     
       //  testMove(c, p);       
         //testHandleWeight(c, p);   
     //    c.lookForItem(4, 0, true);
          /// controlPlace cp= new controlPlace();
         // System.out.println(cp.enoughLight(3, 4, 2, 10));
    }
    
    
    public static void testRollDice(){
        System.out.println("RollDice function:");
        System.out.println("");
        System.out.println("valid inputs:");
        System.out.print("return: " + Dice.rollDice(0)); 
        System.out.println(" expected from 1 to 6");
        System.out.print("return: " + Dice.rollDice(1)); 
        System.out.println(" expected from 1 to 12");
        System.out.print("return: " + Dice.rollDice(2)); 
        System.out.println(" expected from 1 to 18");
        System.out.print("return: " + Dice.rollDice(3)); 
        System.out.println(" expected from 1 to 24");
        System.out.println("");
        System.out.println("invalid inputs:");
        System.out.print("return: " + Dice.rollDice(-5)); 
        System.out.println(" expected -1");
        System.out.print("return: " + Dice.rollDice(-10)); 
        System.out.println(" expected -1");
        System.out.print("return: " + Dice.rollDice(-6)); 
        System.out.println(" expected -1");    
        System.out.println("*************************************");
    }
        
    public static void testProbability(){
        System.out.println("Probability function:");
        System.out.println("");
        System.out.println("valid inputs:");
        System.out.print("return: " + Dice.probability(100)); 
        System.out.println(" expected true");
        System.out.print("return: " + Dice.probability(2)); 
        System.out.println(" expected false");
        System.out.print("return: " + Dice.probability(50)); 
        System.out.println(" expected true or false");     
        System.out.print("return: " + Dice.probability(0)); 
        System.out.println(" expected false");     
        System.out.println("");
        System.out.println("invalid inputs:");
        System.out.print("return: " + Dice.probability(150)); 
        System.out.println(" expected false");
        System.out.print("return: " + Dice.probability(-10)); 
        System.out.println(" expected false");
        System.out.print("return: " + Dice.probability(-25));  
        System.out.println(" expected false");    
        System.out.println("*************************************");
    }
    
    
   
   
   
   //this function test the Move Function
   public static void testMove(controlPlayer c, Player p){     
        System.out.println("Move function:");
        System.out.println("");
        System.out.println("valid inputs:");
        System.out.print("return: " + c.move(10, p)); 
        System.out.println(" expected 10");       
        System.out.print("return: " + c.move(25, p)); 
        System.out.println(" expected 25");
        System.out.print("return: " + c.move(7, p)); 
        System.out.println(" expected 7");
        System.out.print("return: " + c.move(14, p)); 
        System.out.println(" expected 14");
        System.out.println("");
        System.out.println("invalid inputs:");
        System.out.print("return: " + c.move(10, null)); 
        System.out.println(" expected -1");  
        System.out.print("return: " + c.move(-5, p)); 
        System.out.println(" expected -1");  
        System.out.print("return: " + c.move(-2, null)); 
        System.out.println(" expected -1"); 
        System.out.println("*************************************");
        
    }
    
   
}
